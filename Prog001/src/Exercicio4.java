import java.util.Scanner;
//Programa pra dizer pro fazendeiro quantos ovos recolheu,
// tranformar em duzias e quantos ovos sobraram
public class Exercicio4 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int ovos, duzias, resto;

        System.out.println("Quantos ovos foram recolhidos ");
        ovos = teclado.nextInt();
        duzias = ovos / 12;
        resto = ovos%12;
        System.out.println("Tranformado em dúzia " +duzias + " dúzias");

        System.out.println( " o restante que sobra de ovos é "+ ovos % 12);
        System.out.printf("ovos recolhidos %d ovos, em dúzias são %d dúzias e restaram %d ovos" , ovos, duzias, resto);

    }

}
