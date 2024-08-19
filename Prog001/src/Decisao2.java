import java.util.Scanner;
// em um cinema calcular o preço do ingresso, ver se a pessoa é menor de 18 anos paga maia,
// senão paga inteira
public class Decisao2 {
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

        if ( idade < 18) {
            System.out.println(" o valor do teu ingresso é " + meioPreco);
            System.out.printf(" o valor do ingresso é %.2f\n ", meioPreco);
        }

    else {
                System.out.println(" o valor do teu ingresso é " +ingresso);
            System.out.printf(" o valor do teu ingresso é %.2f\n " , ingresso);
            }
            }
            }

