public class Array1 {
    public static void main(String[] args) {
        //vasculha o vetor de argumentos da main()
        for (int i = 0; i < args.length; i++) { // args.legth é o numero de itens de args[]
            System.out.println(i + " = " + args[i]);
        }
    }
}