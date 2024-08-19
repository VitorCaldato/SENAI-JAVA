import java.util.Scanner;
// exemplo de numeros inteiros e fracionários
public class num2Divisao {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // variaveis
        int num1, num2, divisao, resto;
        float numQ;


         System.out.println(" digite 2 numeros com espaço no meio");//mandar digitar os numeros
         num1 = teclado.nextInt();// vai receber o num1
         num2 = teclado.nextInt(); // vai receber o num2

        divisao = num1/num2; // mandar calcular a divisão
        resto = num1%num2; // mandar calcular o resto da divisão
        numQ = (float) num1 / num2; // calcular casas decimais

        System.out.println( " a divisão dos numeros é: " +divisao);
        System.out.println( " O resto dos numeros é: " +resto);//calcula o resto da divisao Ex. a = b % c --- a tem resto do b/c


        System.out.println(" A divisão com casas decimais é "+ numQ);

    }



}
