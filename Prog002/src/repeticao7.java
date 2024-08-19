import java.util.Scanner;

public class repeticao7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num = 0;
        int num2;

        System.out.println(" Digite um número para tabuada ");

        num2 = teclado.nextInt();

        while (num <= 10) {
            System.out.printf(" %d X %d = %d \n", num2, num, (num++ * num2));
        }
    }
}
