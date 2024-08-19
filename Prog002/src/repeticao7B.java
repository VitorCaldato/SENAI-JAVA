import java.util.Scanner;
// fazer todas as tabuadas

public class repeticao7B {
    public static void main(String[] args) {

        int num = 0;
        while (num <= 10) {
            int cont = 1;

            while (cont <= 10) {

                System.out.printf(" %2d X %2d = %3d \n", num, cont, (cont * num));
                // %2d significa reservar em 2 casas, reservar em 3 casas... serve pra tabular o texto
                cont++;
            }
            System.out.println();
            num++;
        }
    }
}