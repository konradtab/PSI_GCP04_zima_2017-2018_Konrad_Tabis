/**
 * Created by Dell on 14.10.2017.
 */
public class Main {
    public static void main(String[] args) {
        Perceptron perceptron = new Perceptron();

        int bias = 1;
        int ilosc_epok=8;
        double learning_factor = 0.15;

        //tablice wejściowe
        int[] x1 = {0, 1, 0, 1};
        int[] x2 = {0, 0, 1, 1};

        //tabela wynikowa dla AND
        int[] y = {0, 0, 0, 1};

        //pętle uczące perceptron z wyświetlaniem wyników po każdej epoce
        System.out.println("Wyniki uczenia perceptonu funkcji AND\n");
        for(int i =0;i<ilosc_epok;i++){
            for(int j=0;j<4;j++)
            {
                perceptron.learn_perceptron(bias,x1[j],x2[j],y[j],learning_factor);
            }
            //Wyświetlanie wyników po każdej epoce
            System.out.println("Epoka numer: "+ i + "\n");
            System.out.println("x1="+x1[0]+" x2="+x2[0]+" y="+y[0]+" wynik = "+ perceptron.process(bias,x1[0],x2[0])+"\n");
            System.out.println("x1="+x1[1]+" x2="+x2[1]+" y="+y[1]+" wynik = "+ perceptron.process(bias,x1[1],x2[1])+"\n");
            System.out.println("x1="+x1[2]+" x2="+x2[2]+" y="+y[2]+" wynik = "+ perceptron.process(bias,x1[2],x2[2])+"\n");
            System.out.println("x1="+x1[3]+" x2="+x2[3]+" y="+y[3]+" wynik = "+ perceptron.process(bias,x1[3],x2[3])+"\n\n");
        }

        //Wyświetlenie wag końcowych
        System.out.println("WAGI:");
        System.out.println("W0 = " + perceptron.weight0);
        System.out.println("W1 = " + perceptron.weight1);
        System.out.println("W2 = " + perceptron.weight2);
    }
    }

