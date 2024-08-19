import java.util.Scanner;

public class exerciciorepeticao {
    public static void main(String[] args) {
        // programa pra contar do 4 até o 11
        //coloque o inicio (4) e o fim (11) em variaveis
        // depois mude para digitar o inicio e o fim
        // imprimir do inicio ao fim e do fim para o começo
        int ini, fim;
        Scanner teclado = new Scanner(System.in);

        System.out.println(" Digite o primeiro número ");
        ini = teclado.nextInt();
// para for int == valor inicial - condição para continuar - o que fazer depois

        System.out.println(" Digite o segundo numero ");
        fim = teclado.nextInt();
// imprime do ini
        int z = ini;
        while (z <= fim) {
            System.out.print(z++ + " ");
        }
        System.out.println();
        //imprime do fim ao ini
            z = fim;
            while (z >= ini) System.out.print(z-- + " ");
        }
}