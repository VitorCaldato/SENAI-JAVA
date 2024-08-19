import java.util.Scanner;

public class Repeticao1 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
// repetição : comando WHILE
        char resposta = 'S';  // char usa aspas simples e guarda um unico caracter

        while (resposta == 'S') { // while quer dizer enquanto

            System.out.println(" era uma vez um gato chines");
            System.out.println(" quer que eu conte outra vez");
            resposta = teclado.next().charAt(0); // charAt(n) pega o caractere nº N da
        }
        System.out.println( " Acabou ");

    }
}
