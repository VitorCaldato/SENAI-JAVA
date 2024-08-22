public class Array0 {
    public static void main(String[] args) {
        int[] numeros = new int[4];
        numeros[0] = 3;
        numeros[1] = 99;
        numeros[2] = 17;
        numeros[3] = 44;
        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("%d - %d\n", i, numeros[i]);
        }
    }
}
