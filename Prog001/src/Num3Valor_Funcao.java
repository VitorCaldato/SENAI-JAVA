import java.util.Scanner;
// pedir valor em dola e imprimir em real

public class Num3Valor_Funcao {
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        float dolar, produto, real;
// digitar cotação + digitar preço + calcular o valor em reais + imprimir o valor em reais


        dolar = digitaFloat("Digite o valor do dolar ");
        produto = digitaFloat("Digite o valor do produto");

        real = converte(dolar, produto);

        System.out.println();
// imprime usando o printf -- (%d para inteiro é para substituir +soma+) \n (nova linha) \t (tabulação)
        // se usar %5d (espaço de 5) -- %9.2f  (nove total considerando 2 casas depois da virgula (f)para float
        // se usar %.2 (identifica quantas casa tiver e 2 casas depois da virgula


        imprimeResultado(dolar, produto, real);
    }

    private static void imprimeResultado(float dolar, float produto, float real) {
        System.out.printf(" O valor do dolar é %.2f o valor do produto é %.2f transformando em reais fica %.2f" , dolar, produto, real);
    }

    private static float digitaFloat(String texto) {
        System.out.println(texto);
        return teclado.nextFloat();
    }

    private static float converte(float dolar, float produto) {
        return dolar * produto;
    }


}
