import java.util.Scanner;
// pedir valor em dola e imprimir em real

public class Num3Valor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float dolar, produto, real;
// digitar cotação + digitar preço + calcular o valor em reais + imprimir o valor em reais

        System.out.println("Digite o valor do dolar ");
        dolar = teclado.nextFloat();
        System.out.println( "Digite o valor do produto");
        produto = teclado.nextFloat();

        real = dolar * produto;

        System.out.println("o valor do dolar é " +dolar+ " o valor do produto é " +produto+
                " transformando em reais fica " + real );

        System.out.println();
// imprime usando o printf -- (%d para inteiro é para substituir +soma+) \n (nova linha) \t (tabulação)
        // se usar %5d (espaço de 5) -- %9.2f  (nove total considerando 2 casas depois da virgula (f)para float
        // se usar %.2 (identifica quantas casa tiver e 2 casas depois da virgula

        System.out.printf(" - dolar %.2f\n - produto %.2f\n - total em reais %.2f\n " ,dolar, produto, real);

    }


}
