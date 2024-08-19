import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Dados1copia {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner arquivo = new Scanner(new File("Prog003/src/Dados1.txt"));

        while (arquivo.hasNext()){ // .hasNext puxa enquanto tiver linha
            String nome = arquivo.nextLine(); // le uma linha do arquivo
            System.out.println(nome);
        }
        arquivo.close(); // fechar a leitura do arquivo
    }
}
