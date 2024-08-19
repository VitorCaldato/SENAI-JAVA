import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Dados2copia {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner arquivo = new Scanner(new File("Prog003/src/Dados2.txt"));
        String nome;
        int idade = 0;
        char sexo;
        float media = 0;
        int cont = 0;
int contF = 0, contM = 0;
float mediaM = 0, mediaF = 0, soma=0;

        // calcular a media das idades

        while (arquivo.hasNext()) {

            nome = arquivo.next();
            idade = arquivo.nextInt();
            media = media + idade;
            cont++;
            sexo = arquivo.next().charAt(0);
            System.out.printf("%-6s\t %d\t %c\n", nome, idade, sexo);

            if (sexo == 'F') {
            mediaF += idade; //  é a mesma coisa que mediaF = mediaF + idade;
            contF++;
            }
            if (sexo == 'M'){
                mediaM += idade;//  é a mesma coisa que mediaM = mediaM + idade;
                contM++;
            }
        }
        System.out.printf(" A média de idade das pessoas é %f ", (media / cont));
        System.out.println();
        System.out.printf(" A média de idade das mulheres é: %f\n", mediaF / contF);
        System.out.printf(" A média de idade dos homens é: %f\n", mediaM / contM);

        arquivo.close();
    }
}
