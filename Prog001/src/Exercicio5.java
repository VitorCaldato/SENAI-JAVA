import java.util.Scanner;
// pergunta quantos alunos e quantos faltaram e calcula a percentagem de quantos faltaram
public class Exercicio5 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int alunos, faltantes;
        double percentual;

        System.out.println("Quantos alunos tem na sala ");
        alunos = teclado.nextInt();

        System.out.println("Digite quantos alunos faltaram :");
        faltantes = teclado.nextInt();
        percentual = (double)faltantes / alunos * 100;

        System.out.println("O percentual  de alunos que faltaram na aula é " + percentual);
        System.out.printf(" tem na sala %d faltou de alunos %d e a porcnetagem fica %f  " ,alunos, faltantes, percentual);
    }
}
