import java.util.Random;

/**
 * Created by Dell on 13.10.2017.
 */

public class Perceptron {
    Random generator =new Random();

    //wagi poczatkowe
    //1)ustawione randomowo
    public double weight0=generator.nextDouble(),weight1=generator.nextDouble() ,weight2=generator.nextDouble();
    //2)ustawione na wartość stałą
    //public double weight0=0.5,weight1=0.5,weight2=0.5;

    public int perceptronOut (double perceptronOut)
    {
        if(perceptronOut<0)return 0;
        else return 1;
    }
    public int process ( int x0, int x1, int x2 ) {
        double y_p = x0 * weight0 + x1 * weight1 + x2 * weight2;
        return perceptronOut( y_p );
    }

    //algorytm uczenia perceptronu
    public void learn_perceptron(int x0, int x1, int x2, double y, double  learning_factor)
    {
        double perceptronOut = x0 * weight0 + x1 * weight1 + x2 * weight2;
        perceptronOut = perceptronOut(perceptronOut);
        weight0 += ( y - perceptronOut ) * learning_factor * x0;
    }

}
