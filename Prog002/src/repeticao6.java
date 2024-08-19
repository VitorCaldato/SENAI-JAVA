import java.util.Scanner;

public class repeticao6 {
    public static void main(String[] args) {
        // imprimir temperaturas dem Celsius de 0 a 100 de 5 em 5º
        // e em Fahrenheit (F = (C*9.0/5) + 32
        double grausC = 0, grausF;

        while ( grausC <=100){
        grausF = (grausC*9.0/5)+32;
            System.out.printf("C = %4.0f\t F = %4.0f\n", grausC, grausF);
            grausC = grausC + 5;
        }
    }
}
