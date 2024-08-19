import java.util.Scanner;

// programa para calcular quandos km
public class Exercicio6 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int km;
        double litros, media;

        System.out.println(" Informe quantos kilometros foram percorridos ");
        km = teclado.nextInt();

        System.out.println(" Informar quando litros gastou na viagem");
        litros = teclado.nextDouble();
        media = km / (double) litros;

        System.out.println(" A média do veiculo na viagem foi " + media);
        System.out.printf(" foi percorrido de kilometragem %d, foi gasto de combustivel %.2f de litros e deu uma média de %.2f km/litro", km, litros, media);


    }
}
