import java.util.Scanner;

// peça pra digitar a idade de duas pessoas e imprima o nome da mais velha
// digite um nome depois digite a idade
// digite outro nome e digite a idade
// imprimir a mais velha

public class Decisao4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int idade1, idade2;
        String nome1, nome2;

        System.out.println("informe o primeiro nome ");
        nome1 = teclado.next();

        System.out.println("informe a primeira idade");
        idade1 = teclado.nextInt();

        System.out.println("informe o segundo nome");
        nome2 = teclado.next();

        System.out.println("informe a segunda idade");
        idade2 = teclado.nextInt();

        if (idade1 > idade2){
            System.out.printf(" A %s é a mais velha" , nome1);
            }
        else if (idade2 > idade1) {
            System.out.printf(" A %s é a mais velha " , nome2);}

            else {
            System.out.print(" As idades são iguais ");
            }
        }
    }


