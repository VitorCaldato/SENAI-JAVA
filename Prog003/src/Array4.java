public class Array4 {
    public static void main(String[] args) {
        //crie um array de 11 posições contendo a tabuada do 7
        // em cada posição do array tem o multiplo de 7 do numero da posição
        int [] numero = new int [11];

        for (int i = 0; i < 11; i++) {
            numero[i] = 7*i;
            System.out.printf("7 x %d = %d\n ", i, numero[i]);

        }
    }
}
