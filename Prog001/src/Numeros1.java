import java.sql.SQLOutput;
import java.util.Scanner;
// digitar 2 numeros e mostrar a soma, substração, divisão emultiplicação

public class Numeros1 { // programa completa quando criado
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // quando for usar o teclado(entrada)

        int num1, num2, soma, subt, mult, div; //declarar variaveis
        System.out.print( " digite um numero "); //pede pro usuario digitar um numero, mesma linha(saida)
         num1 = scanner.nextInt(); // num1 = recebe o que foi digitado

        System.out.print( " digite outro numero ");//pede pro usuario digitar um numero
        num2 = scanner.nextInt(); // num2 = recebe o que foi digitado

        soma = num1 + num2;
        subt =  num1 - num2;
        mult = num1 * num2;
        div= num1 / num2;

        System.out.println(" A soma do número " +num1+ " mais o " +num2+ " é " +soma ); //
        System.out.println(" A diferença do número " +num1+ " menos o " +num2+ " é " +subt ); //
        System.out.println(" A multiplicação dos numeros é " + mult);
        System.out.println(" A divisão dos numeros é: " + div);

// imprime usando o printf -- (%d para inteiro é para substituir +soma+) \n (nova linha) \t (tabulação)
        // se usar %5d (espaço de 5) -- %9.2f  (nove total considerando 2 casas depois da virgula (f)para float
        // se usar %.2 (identifica quantas casa tiver e 2 casas depois da virgula

        System.out.printf(" - soma %5d\n - subt %9.2d\n - mult %.2d\n - div %d\n ", soma, subt, mult, div);
    }
}
