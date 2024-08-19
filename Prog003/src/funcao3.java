public class funcao3 {
    // função void para doguinho que imprima auau
    static void doguinho() {
        System.out.println(" au au");
    }

    //criar void dogão (int n) que vc passe o numero de vezes para imprimir AUAU
    private static void dogão(int n) {
        int i = 1;
        while (i <= n) {
            System.out.print(" AU ");
            i++;
        }
        System.out.println();
    }
    // função void pinscher (n) que imprima AUauAUau

    private static void pinscher(int n) {
        int i = 1;
        while (i <= n) {

            if (i % 2 == 0) {
                System.out.print("AU");
            } else {
                System.out.print("au");
            }
            i++;

        }
    }


    public static void main(String[] args) {

        doguinho(); // faz au au
        doguinho(); // faz au au
        dogão(3); // faz AU AU AU
        dogão(5);
        pinscher(8);


    }
}
