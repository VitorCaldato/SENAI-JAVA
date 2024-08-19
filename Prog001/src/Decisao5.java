
import java.util.Scanner;
// 2 numeros e ver se é par ou impar
public class Decisao5 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int num1;

        System.out.println(" Digite um número ");
        num1 = teclado.nextInt();

        if (num1 % 2 == 0) {
            System.out.printf(" O numero %d digitado é um número par ", num1);
        } else {
            System.out.printf(" O numero %d digitado é um número impar ", num1);
        }
    }
}
