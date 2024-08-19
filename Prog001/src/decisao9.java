import java.util.Scanner;

public class decisao9 {
    /* saber se 3 numeros representam o comprimento de um triangulo
    cada numero tem que ser menor que a soma dos outros dois
    pedir 3 numeros e dizer se eles fazem um triangulo ou não
    */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int lado1, lado2, lado3;
        System.out.println(" Digite 3 numeros separados por espaço ");
        lado1 = teclado.nextInt();
        lado2 = teclado.nextInt();
        lado3 = teclado.nextInt();
        //saber se 3 numeros representam o comprimento de um triangulo

        if ((lado1 < lado2 + lado3) && (lado2 < lado1 + lado3) && (lado3 < lado1 + lado2)) {
            System.out.println(" Isto formou um triângulo ");
            if ((lado1 == lado2) && (lado2 == lado3) && (lado3 == lado1)) {
                System.out.println(" o triangulo é equilátero ");
            }

            if ((lado1 != lado2) && (lado1 != lado3) && (lado2 != lado3)) {
                System.out.println(" o triangulo é escaleno");
            }

            if ((lado1 == lado2 && lado1 != lado3) || (lado1 == lado3 && lado1 != lado2) || (lado2 == lado3 && lado2 != lado1)) {
                System.out.println(" o triangulo é isósceles");
            }
        } else {
            System.out.println(" Não é triângulo ");
        }
    }
}
