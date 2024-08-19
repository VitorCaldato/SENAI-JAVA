import java.util.Scanner;

public class repeticao66 {
    public static void main(String[] args) {
        // elevador tem limite de 300kg
        // peça o peso das pessoas até encher e imprima "SUBINDO " com total de peso
        int peso = 0, total = 0;
        Scanner teclado = new Scanner(System.in);

        System.out.println(" Digite seu peso para entrar no elevador");

        while (total < 300) {
            peso = teclado.nextInt();
            total = total + peso;
            System.out.printf(" Subindo...");
        }
            if (total > 300){

            System.out.println(" Peso excedido, o máximo é 300");
        }

        }
    }

