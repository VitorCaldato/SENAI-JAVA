import java.util.Scanner;

// em um cinema calcular o preço do ingresso, ver se a pessoa é menor de 18 anos paga meia
// ou maior igual a 65 paga meia
// senão paga inteira

public class Decisao3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int idade;
        float ingresso, meioPreco;
        ingresso = 26;
        meioPreco = 13;
        // perguntar a idade
        // se menor de 18 calcula meia entrada

        System.out.println("informe qual sua idade");
        idade = teclado.nextInt();

        if (idade < 18) {
            System.out.printf(" o valor pra menor é meia entrada ou seja R$ %.2f\n", meioPreco);
        } else {
            if (idade >= 65) {
                System.out.printf(" o valor pra idoso de meia entrada ou seja R$ %.2f\n ", meioPreco);
            }
            else {
                System.out.printf("O valor do ingresso cheio é de R$ %.2f " , ingresso);
            }
        }
    }
}

