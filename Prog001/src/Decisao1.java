import java.util.Scanner;
//desconto de um produto, informar preço em reais
// Se o preço for maior que 1000, pedir percentual de desconto.
// Programa informa se for mais de 1000 dá 5% de desconta e informa o preço final

public class Decisao1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double preco, percDesconto, reaisDesconto, valorPagar;

        System.out.println("Informe o preço do produto em reais ");
        preco = teclado.nextDouble();

        if (preco >= 1000){
            System.out.println("informe quantos porcentos vai ganhar");
            percDesconto = teclado.nextDouble();

        valorPagar = preco - percDesconto;
        reaisDesconto = preco * (percDesconto/100);
        System.out.printf("O valor do produto é %.2f , com desconto de %.2f , ficando o final de %.2f", preco, percDesconto, valorPagar);

    }
    }
}
