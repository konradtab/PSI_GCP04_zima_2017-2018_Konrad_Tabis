/**
 * Created by Dell on 14.10.2017.
 */
public class Main {
    public static void main(String[] args)
    {
        Perceptron perceptron=new Perceptron();

        int a=4,b=4,c=4,d=4,s=a+b+c+d;
        int bias=1;
        double learning_factor=0.1;

        //tablice wejściowe
        int[] x1 ={0,1,0,1};
        int[] x2 ={0,0,1,1};

        //tabela wynikowa dla AND
        int[] y={0,0,0,1};

        //j-ilość wykonanych pętli na konkretnym zestawie danych
        //pętla dla pierwszej danej [0,0|0]
        for ( int i = 0,j=0; j < a; j++ ) {
            perceptron.learn_perceptron( bias, x1[i], x2[i], y[i], learning_factor );
        }
        //pętla dla drugiej danej [1,0|0]
        for ( int i = 1,j=0; j < b; j++ ) {
            perceptron.learn_perceptron( bias, x1[i], x2[i], y[i], learning_factor );
        }
        //pętla dla trzeciej danej [0,1|0]
        for ( int i = 2,j=0; j < c; j++ ) {
            perceptron.learn_perceptron( bias, x1[i], x2[i], y[i], learning_factor );
        }
        //pętla dla czwartej danej [1,1|1]
        for ( int i = 1,j=0; j < d; j++ ) {
            perceptron.learn_perceptron( bias, x1[i], x2[i], y[i], learning_factor );
        }

        System.out.println("Wyniki uczenia perceptonu funkcji AND\n");
        System.out.println("Przeprowadzono " + s + " prób uczenia się\nDla 0,0 przeprowadzono " +a+ " próby\nDla 1,0 przeprowadzono " +b+
        " próby\nDla 0,1 przeprowadzono " +c+ " próby\nDla 1,1 przeprowadzono "+d+ " próby\n");

        System.out.println( "WAGI:" );
        System.out.println( "W0 = " + perceptron.weight0 );
        System.out.println( "W1 = " + perceptron.weight1 );
        System.out.println( "W2 = " + perceptron.weight2 );

        System.out.println("\nWynik dla x1=0 i x2=0");
        System.out.println( perceptron.process( bias, 0, 0 ) );
        System.out.println("\nWynik dla x1=0 i x2=1");
        System.out.println( perceptron.process( bias, 0, 1 ) );
        System.out.println("\nWynik dla x1=1 i x2=0");
        System.out.println( perceptron.process( bias, 1, 0 ) );
        System.out.println("\nWynik dla x1=1 i x2=1");
        System.out.println( perceptron.process( bias, 1, 1 ) );
    }
}
