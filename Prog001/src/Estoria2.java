import java.util.Scanner;

public class Estoria2 {
    public static void main(String[] args) {
        // escreva um programa que vai contar estória
        // criar variavel pro nome e pra outra passoaa
        // e outra variavel
        // jogue valores nas variaveis
        String nome1, nome2, lugar;

// manda digitar os valores das variaveis

        Scanner teclas = new Scanner(System.in);
        System.out.println(" Digite o primeiro nome");
        nome1 = teclas.nextLine();
        System.out.println(" Digite o segundo nome");
        nome2 = teclas.nextLine();
        System.out.println(" Digite o lugar");
        lugar = teclas.nextLine();


        System.out.println( "Era uma vez a " + nome1 + " que não conhecia a " + nome2);
        System.out.println("Elas começaram a fazer o curso no " + lugar + " depois que fizeram a prova a " +
nome1 + " reprovou e a " + nome2 + " também.");
        System.out.println("A " + nome1 + " e a " + nome2 +" pediram prova de recuperação...");
        System.out.println("Depois da prova a " + nome1 + " reprovou e a " + nome2 + " também" );
    }
}
