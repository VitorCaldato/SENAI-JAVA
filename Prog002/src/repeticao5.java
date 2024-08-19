public class repeticao5 {
    public static void main(String[] args) {
        //imprimir numeros de 1 a 10 em ordem crescente
        // inserir ao final a soma de todos os numeros
        int num = 0;
        int soma = 0;

        while (num <= 10) {
            soma = soma + num;
            System.out.println(num);
            num = num + 1;
            System.out.println(+soma);
        }
    }
}
