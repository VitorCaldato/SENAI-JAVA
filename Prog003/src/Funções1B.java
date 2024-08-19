import java.util.Scanner;

public class Funções1B {

    public static void main(String[] args) {
        //pergunta o nome do cabra
        String cabra = perguntaNomeDoCabra();
        //diga olá pro cabra
        digaOláProCabra(cabra);
        digaOláProCabra(" mariana");
    }


    public static void digaOláProCabra(String nome) {
        System.out.println("olá " + nome);
    }

    private static String perguntaNomeDoCabra() {
        Scanner leitora = new Scanner(System.in);
        System.out.println(" Digita o nome");
        return leitora.nextLine(); // return joga o valor de volta pra quem chamou
        // return faz " perguntaNomeDoCabra" valer "juca"
    }
}
