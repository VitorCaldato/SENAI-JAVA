
import java.util.Scanner;

// digitar 2 numeros e imprimir a diferença entre eles sem mostrar numeros negativos
public class Decisao6 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int num1, num2, resultado;

        System.out.println(" Digite dois numeros números separados por espaço ");
        num1 = teclado.nextInt();
        num2 = teclado.nextInt();

        if (num1 > num2) {
            System.out.printf("x A diferença entre os numeros é %d ", num1 - num2);
        } else {
            System.out.printf("y A diferença entre os numeros é %d ", num2 - num1);
        }
    }
}
