import org.w3c.dom.ls.LSOutput;
// dontpad.com - rosettacold.org
import java.util.Scanner;

public class Modelo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println( " digite seu nome ");

        String nome = scanner.nextLine();

        System.out.println (" seu nome é " + nome);
        System.out.println (" seu nome em maiuscula " + nome.toUpperCase());
        System.out.println (" seu nome em minuscula " + nome.toLowerCase());
        System.out.println (" seu nome em comprimento  " + nome.length());
        System.out.println("Seu nome com U:"+nome.replaceAll("[AEIOUÁÉÍÓÚÂÊÎÔÛÃÕ]", "U").replaceAll("[aeiouáéíóúâêîôûãõ]", "u"));
        System.out.println(" a ... letra do seu nome é " + nome.charAt(2));
    }
}
