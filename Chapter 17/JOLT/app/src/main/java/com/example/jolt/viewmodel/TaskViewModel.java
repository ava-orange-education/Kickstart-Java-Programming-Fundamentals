package com.example.jolt.viewmodel;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.example.jolt.models.Task;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TaskViewModel extends AndroidViewModel {
    private static final String PREFS_NAME = "JOLT_PREFS";
    private static final String TASKS_KEY = "TASKS";
    private final MutableLiveData<List<Task>> taskList = new MutableLiveData<>(new ArrayList<>());
    private final SharedPreferences sharedPreferences;

    public TaskViewModel(@NonNull Application application) {
        super(application);
        sharedPreferences = application.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
        loadTasks();  // Load tasks when ViewModel is created
    }

    public LiveData<List<Task>> getTasks() {
        return taskList;
    }

    public void addTask(String description) {
        List<Task> currentTasks = taskList.getValue();
        currentTasks.add(new Task(description));
        taskList.setValue(currentTasks);
        saveTasks();  // Save updated task list
    }

    public void removeTask(int position) {
        List<Task> currentTasks = taskList.getValue();
        currentTasks.remove(position);
        taskList.setValue(currentTasks);
        saveTasks();  // Save updated task list
    }

    private void saveTasks() {
        List<Task> tasks = taskList.getValue();
        Set<String> taskSet = new HashSet<>();
        for (Task task : tasks) {
            taskSet.add(task.getDescription());
        }
        sharedPreferences.edit().putStringSet(TASKS_KEY, taskSet).apply();
    }

    private void loadTasks() {
        Set<String> taskSet = sharedPreferences.getStringSet(TASKS_KEY, new HashSet<>());
        List<Task> loadedTasks = new ArrayList<>();
        for (String description : taskSet) {
            loadedTasks.add(new Task(description));
        }
        taskList.setValue(loadedTasks);
    }
}
