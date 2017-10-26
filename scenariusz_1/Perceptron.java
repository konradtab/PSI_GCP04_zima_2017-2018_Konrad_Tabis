import java.util.Random;

/**
 * Created by Dell on 13.10.2017.
 */
//klasa perceptronu
public class Perceptron {
    Random generator =new Random();

    //wagi poczatkowe
    //ustawione randomowo
    public double weight0=generator.nextDouble(),weight1=generator.nextDouble() ,weight2=generator.nextDouble();

    //funkcja progowa
    public int perceptronOut (double perceptronOut)
    {
        if(perceptronOut<0)return 0;
        else return 1;
    }

    //funkcja sumująca iloczyny danych wejściowych i odpowiedających im wag
    public int process ( int x0, int x1, int x2 ) {
        double y_p = x0 * weight0 + x1 * weight1 + x2 * weight2;
        return perceptronOut( y_p );
    }

    //algorytm uczenia perceptronu
    public void learn_perceptron(int x0, int x1, int x2, double y, double  learning_factor)
    {
        double percOut=process(x0,x1,x2);
        weight0 += ( y - percOut ) * learning_factor * x0;
        weight1 += ( y - percOut ) * learning_factor * x1;
        weight2 += ( y - percOut ) * learning_factor * x2;
    }
}
