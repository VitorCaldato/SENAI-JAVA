import java.util.Random;

public class Array6 {
    public static void main(String[] args) {
        // encha um array de int com numeros aleatorios de 1 a 100
        Random chutador = new Random(); // cria um gerador ne numeros aleatorios
        int [] numeros = new int [10];

        for (int i = 0; i < 10; i++) {
            numeros[i] = chutador.nextInt(100);
            System.out.printf(" %02d" , numeros[i]);
        }
        System.out.println();
            //crie outro vetor de 10 inteiros e copie o vetor numeros de tras para frente dentro dele
        int[] inverter = new int [10];
        for (int j = 0; j < 10; j++) {
            inverter[j] = numeros [9 - j];
// no fim imprima o invertido
            System.out.printf(" %02d" , inverter[j]);
        }
        System.out.println();

    }

}
