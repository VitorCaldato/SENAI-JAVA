import java.util.Scanner;
public class funcao2 {

    static float percFaltas (float total, float faltantes){
        return faltantes / total * 100;

    }

    public static void main (String[] args) {
        //criar função float que receba 2 float (parte e tudo) e calcule a porcentagem
        //depois perguntar total de alunos, quantos alunos faltaram e qual a porcentagem dos que faltaram
        //exemplo 40 alunos faltaram 8
        Scanner teclado = new Scanner(System.in);
        //digita os valores

        float total, faltantes;

        System.out.println(" Digite quantos alunos tem na sala ");
        total = teclado.nextFloat();
        System.out.println(" Digite quantos alunos faltaram na sala");
        faltantes = teclado.nextFloat();

        System.out.println(percFaltas(total, faltantes));
    }

}
