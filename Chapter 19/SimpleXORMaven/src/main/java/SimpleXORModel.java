
import org.nd4j.linalg.api.ndarray.INDArray;
import org.nd4j.linalg.factory.Nd4j;
import org.nd4j.linalg.dataset.DataSet;
import org.deeplearning4j.nn.multilayer.MultiLayerNetwork;
import org.deeplearning4j.nn.conf.MultiLayerConfiguration;
import org.deeplearning4j.nn.conf.NeuralNetConfiguration;
import org.deeplearning4j.nn.conf.layers.DenseLayer;
import org.deeplearning4j.nn.conf.layers.OutputLayer;
import org.nd4j.linalg.lossfunctions.LossFunctions;
import org.nd4j.linalg.activations.Activation;
import org.nd4j.linalg.learning.config.Sgd;

public class SimpleXORModel {
    public static void main(String[] args) {

        INDArray input = Nd4j.create(new double[][]{
            {0, 0},
            {0, 1},
            {1, 0},
            {1, 1}
        });

        INDArray labels = Nd4j.create(new double[][]{
            {0},
            {1},
            {1},
            {0}
        });

        DataSet ds = new DataSet(input, labels);

        MultiLayerConfiguration config = new NeuralNetConfiguration.Builder()
            .seed(123)
            .updater(new Sgd(0.1))
            .list()
            .layer(new DenseLayer.Builder().nIn(2).nOut(4).activation(Activation.SIGMOID).build())
            .layer(new OutputLayer.Builder().nIn(4).nOut(1).activation(Activation.SIGMOID)
                    .lossFunction(LossFunctions.LossFunction.MSE).build())
            .build();

        MultiLayerNetwork model = new MultiLayerNetwork(config);
        model.init();

        for (int i = 0; i < 10000; i++) {
            model.fit(ds);
        }

        INDArray output = model.output(input);
        System.out.println("Input:\n" + input);
        System.out.println("Predicted Output:\n" + output);
    }
}
