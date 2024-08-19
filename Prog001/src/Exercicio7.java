import java.util.Scanner;
//desconto de um produto, informar preço em reais e percentual de desconto.
// Programa informa quantos reais de desconto e o valor a pagar

public class Exercicio7 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double preco, percDesconto, reaisDesconto, valorPagar;

        System.out.println("Informe o preço do produto em reais ");
        preco = teclado.nextDouble();

        System.out.println("Informe quanto de desconto será concedido pro cliente ");
        percDesconto = teclado.nextDouble();

        reaisDesconto = preco * (percDesconto/100);
        valorPagar = preco - reaisDesconto;

        System.out.println("Seu produto custa " +preco+ " reais, voce receberá de " +percDesconto+ " de desconto e o total do desconto é "
                +reaisDesconto+
                "e teu produto ficará no valor final de " +valorPagar );
        System.out.printf(" O produto custa %.2f recebera %.2f de desconto em reias fica %.2f ficando no total para pagar %.2f", preco, percDesconto, reaisDesconto, valorPagar);



    }
}
