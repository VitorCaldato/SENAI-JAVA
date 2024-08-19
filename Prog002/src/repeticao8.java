import java.util.Scanner;
//imprimir numeros de 1 a 100
// se for multiplo de 3 imprimir FIZZ atras do numero
// se for multiplo de 5 imprimir BUZZ atras do numero
// se for multiplo de 3 e 5 ao mesmo tempo imprimir FIZZBUZZ atras do numero

public class repeticao8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num=0;

        while (num <= 100) {
            System.out.print(num);

            if (num %3 == 0) System.out.print("FIZZ");
            if (num %5 == 0) System.out.print("BUZZ");
            System.out.println();

            num++;

        }
    }}




