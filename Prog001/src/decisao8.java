import java.util.Scanner;

/* Escreva um programa que leia quatro notas escolares de um aluno e
apresentar uma mensagem que o aluno foi aprovado se o valor da média
escolar for maior ou igual a 7. Se o valor da média for menor que 7,
solicitar a nota do recuperação, somar com o valor da média e obter
a nova média. Se a nova média for maior ou igual a 7, apresentar uma
mensagem informando que o aluno foi aprovado na recuperação.
Se o aluno não foi aprovado, apresentar uma mensagem informando esta
condição. Apresentar junto com as mensagens o valor da média do aluno
 */
public class decisao8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
// ler 4 notas
        float N1, N2, N3, N4, Media, nRec, mFinal;
        System.out.println("Digite as 4 notas da prova seguido de espaço ");
        N1 = teclado.nextFloat();
        N2 = teclado.nextFloat();
        N3 = teclado.nextFloat();
        N4 = teclado.nextFloat();
// se nota maior que 7 aluno aprovado
        Media = ((N1 + N2 + N3 + N4) / 4);
        System.out.printf(" Sua nota final foi %.3f\n ", Media);

        if (Media >= 7) {
            System.out.println(" Com essa nota final você foi aprovado, Parabéns");
        }
        //nota menor que 7 solicitar recuperação
        else {
            System.out.println(" Com essa nota final vc deve fazer a recuperação ");
            System.out.println("Digite a nota que foi tirada na recuperação");

            nRec = teclado.nextFloat();
            // nota da recuperação + media dizer nota
            mFinal = ((nRec + Media) / 2);
            // avisar mensagem se aprovado ou não
            if (mFinal > 7) {
                System.out.printf("Agora sim, vc conseguiu e foi aprovado");
            } else {
                System.out.printf(" Vc não tem jeito, com essa nota %.2f ", mFinal, "vc foi reprovado ...");
            }
        }
}
}