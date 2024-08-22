import java.util.Scanner;

public class Array5 {
    public static void main(String[] args) {
        // empresa com 3 categoria de aluguel veiculo
        // luxo 500 reias, empresarial 300 e popular 200 po dia
        // criar vetor 3 posições float com o preço
        // qual categoria de carro (1, 2, 3) quantos dias vai ficar
        // imprimir quanto vai custar

       float[] preço = new float [3]; // posição 0,1 e 2. Não é posição 1,2 e 3
        preço[0] = 500; // luxo
        preço[1] = 300; // empresarial
        preço[2] = 200; // popular


        Scanner teclado = new Scanner(System.in);
        System.out.println( "escolha qual categoria 1, 2  ou 3 ");
        int categoria = teclado.nextInt();
        System.out.println( " Diga quantos dias ficará com o carro ");
        int dias = teclado.nextInt();

        float total = dias * preço[categoria-1];
        System.out.println(" O valor total ficará: " + total);

    }
}
