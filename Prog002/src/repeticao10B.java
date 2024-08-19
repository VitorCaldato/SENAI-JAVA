public class repeticao10B {
    public static void main(String[] args) {
        // programa para digitar MARIETA e imprimir um triangulo assim:
        // MARIETA 0123456
        // ARIETA 012345
        // RIETA 01234
        // IETA 0123
        // ETA 012
        // TA 01
        // A 0

        String nome = "MARIETA";
        int tamanho, x, y;

        tamanho = nome.length();

        x = 0;
        while (x < tamanho) {
            System.out.println(nome);
            x++;

        }

    }

}
