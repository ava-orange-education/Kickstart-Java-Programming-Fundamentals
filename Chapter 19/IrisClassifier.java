import weka.classifiers.Classifier;
import weka.classifiers.trees.J48;
import weka.core.Instances;
import weka.core.converters.ConverterUtils.DataSource;
import weka.classifiers.Evaluation;

public class IrisClassifier {
    public static void main(String[] args) throws Exception {
        // Load dataset
        DataSource source = new DataSource("iris.arff");
        Instances data = source.getDataSet();

        // Set class index to the last attribute (the target class)
        data.setClassIndex(data.numAttributes() - 1);

        // Initialize the classifier (J48 Decision Tree)
        Classifier classifier = new J48();
        classifier.buildClassifier(data);

        // Instead of cross-validation:
        Evaluation eval = new Evaluation(data);
        eval.evaluateModel(classifier, data);


        // Output model and evaluation metrics
        System.out.println(classifier);
        System.out.println(eval.toSummaryString("\n=== Evaluation Results ===\n", false));
        System.out.println("Confusion Matrix:");
        double[][] matrix = eval.confusionMatrix();
        for (double[] row : matrix) {
            for (double val : row) {
                System.out.print((int) val + " ");
            }
            System.out.println();
        }
    }
}
