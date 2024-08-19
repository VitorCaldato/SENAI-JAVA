import java.util.Scanner;

public class repeticao3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // o cpu chuta um numero entre 1 e 5

        int numero = 1 + Math.round(4 * (float) Math.random());
        int chute;
        int vezes = 0;
// agora repete ate vc adivinhar o numero
        do { //repetiçao com teste no final
            System.out.println("chute um numero de 1  a 5 ");
            chute = teclado.nextInt();
            if (numero != chute) {
                System.out.println(" Errrouuu");
            }
            vezes++; // soma mais 1 todas as vezes ou mesmo que vezes = vezes +1
        } while (chute != numero) ;
            System.out.println(" ACERTOU " + vezes+ " tentativas" );
        }
    }