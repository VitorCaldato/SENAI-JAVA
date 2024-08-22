import java.util.Scanner;

public class repeticao66vetor {
    public static void main(String[] args) {
        // elevador tem limite de 300kg
        // peça o peso das pessoas até encher e imprima "SUBINDO " com total de peso
        //cada pessoa que pode entrar adicionar no vetor e imprimir o peso de cada um
        Scanner teclado = new Scanner(System.in);
        int peso = 0, total = 0;

        int[] pessoas = new int[6];
        int x = 0;

        while (total <= 300) {

            System.out.println(" Digite seu peso para entrar no elevador");
            peso = teclado.nextInt();
            total = total + peso;
            if (total <= 300) {
                pessoas[x] = peso;
                x++;
            }
        }

        System.out.println(" Peso excedido, o máximo é 300");
            total = total - peso;

        System.out.printf(" subindo com %d pessoas e peso total %d Kg", x, total);

        for (int i = 0; i < x; i++) {
            System.out.printf(" o peso foi: %d\n" , pessoas[i]);
        }
    }
}

