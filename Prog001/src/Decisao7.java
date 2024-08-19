
import java.util.Scanner;

// perguntar idade e genero e responder algumas perguntas
public class Decisao7 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int idade;
        String genero;
// pergunta idade e genero
        System.out.println(" Digite idade ");
        idade = teclado.nextInt();
        System.out.println(" Digite genero ");
        genero = teclado.next();

        // testar se é adulto
        if ((idade >= 18) && (idade < 65)) { // - &&significa "E"
            System.out.printf(" É adulto ");
        }
        //testar se paga meia
        if ((idade < 18) || (idade >= 65)) { // - ||significa "OU"
            System.out.printf(" Paga meia ");
        }
        // testar mulheres e criança
        if (genero.equalsIgnoreCase("F") || (idade < 14)) { //OU
            System.out.printf(" mulheres e crianças"); //
            // equalsIgnoreCase significa ignorar se é MAIUSCULA OU MINUSCULA
        }
        // testar proibir meninos
        if (genero.equalsIgnoreCase("M") ) {
            System.out.printf(" proibido meninos ");
        }
        else if (!genero.equalsIgnoreCase(" F") && (!genero.equalsIgnoreCase("M"))) {

            System.out.println(" \n y genero não informado....");
        }
    }}
