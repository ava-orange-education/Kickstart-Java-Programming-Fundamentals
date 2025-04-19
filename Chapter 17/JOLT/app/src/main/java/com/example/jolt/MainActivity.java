package com.example.jolt;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.jolt.models.Task;
import com.example.jolt.viewmodel.TaskViewModel;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private TaskViewModel taskViewModel;
    private EditText taskInput;
    private TaskAdapter taskAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        taskViewModel = new ViewModelProvider(this).get(TaskViewModel.class);
        taskInput = findViewById(R.id.taskInput);
        Button addButton = findViewById(R.id.addButton);
        RecyclerView taskList = findViewById(R.id.taskList);

        taskList.setLayoutManager(new LinearLayoutManager(this));
        taskAdapter = new TaskAdapter();
        taskList.setAdapter(taskAdapter);

        // Observe LiveData to update RecyclerView dynamically
        taskViewModel.getTasks().observe(this, newTasks -> taskAdapter.setTasks(newTasks));

        addButton.setOnClickListener(v -> {
            String taskText = taskInput.getText().toString().trim();
            if (!taskText.isEmpty()) {
                taskViewModel.addTask(taskText);
                taskInput.setText("");  // Clear input field after adding a task
            }
        });

        // Handle task deletion
        taskAdapter.setOnTaskClickListener(position -> taskViewModel.removeTask(position));
    }
}
