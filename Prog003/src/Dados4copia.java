import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Dados4copia {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner arquivo = new Scanner(new File("Prog003/src/Dados2.txt"));
        String nome;
        int idade = 0;
        char sexo;
        int maior = 0, segundoMaior = 0; // tem que informar um numero pequeno pra poder achar um numero maior
        int menor = 200, segundo = 0; // tem que informar um numero alto pra poder achar um numero menor
        String nomeMaior = " ", nomeMenor = " ", segundoVelho = " ";


        // imprimir a idade da pessoa mais velha
        // depois imprimir o nome do mais velho
        // depois fazer o mesmo para o mais novo
        // imprimir a segunda pessoa mais velha

        while (arquivo.hasNext()) {

            nome = arquivo.next();
            idade = arquivo.nextInt();
            sexo = arquivo.next().charAt(0);

            System.out.printf("%-6s\t %d\t %c\n", nome, idade, sexo);  //aqui já imprimiu a idade;

            if (idade > maior) {
                segundo =maior;
                segundoVelho = nomeMaior;

                maior = idade;
                nomeMaior = nome;
    } else {
                if (idade > segundo){
                    segundo = idade;
                    segundoVelho = nome;
                }
            }
            if (idade < menor) {
                menor = idade;
                nomeMenor = nome;
            }



                 }
        arquivo.close();

        System.out.printf(" A idade da pessoa mais velha é %d anos", maior);
        System.out.printf(" O nome da pessoa mais velha é %s " , nomeMaior);
        System.out.println();
        System.out.printf(" A idade da pessoa mais nova é %d anos ", menor);
        System.out.printf(" O nome da pessoa mais velha é %s " , nomeMenor);
        System.out.println();
        System.out.printf(" A idade da 2ª pessoa mais velha é %d anos", segundo);
        System.out.printf(" O nome da pessoa mais velha é %s " ,segundoVelho);
    }

}
