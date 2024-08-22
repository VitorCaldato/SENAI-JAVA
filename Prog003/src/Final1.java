//faça um programa que peça o preço do produto e quantidade e calcule o total
//caso o total maior que 1000 ou a quantidade maior que 100 dá 5 % desconto

// depois perguntar se deseja comprar mais? caso sim repita
//no final imprima o total a pagar de descontos concedidos

import java.util.Scanner;

public class Final1 {
    public static void main(String[] args) {

        double quantidade, preço, total, percdesconto = 5, descontoreal=0;
        double totalGeral=0, totalDesconto=0;
        Scanner teclado = new Scanner(System.in);
        int num;
        do {
            System.out.println(" Digite o preço do produto: ");
            preço = teclado.nextDouble();
            System.out.println(" Diga a quantidade que vai levar do produto: ");
            quantidade = teclado.nextDouble();
            total = (quantidade * preço);
            totalGeral += total;


            if ((preço >= 1000) || (quantidade >= 100)) {
                descontoreal = total * (percdesconto / 100);
                System.out.printf("voçe terá %.2f de desconto", descontoreal);
                total -= descontoreal;
                totalDesconto += descontoreal;
            }
            System.out.printf(" Pra ter %.2f unidades do produto com valor unitário de R$ %.2f, " +
                    "você pagará o total de %.2f ", quantidade, preço, total);
            System.out.println();
            System.out.println(" Deseja comprar mais? Digite 1 para SIM ou digite 2 para NÃO ");

            num = teclado.nextInt();
            if (num == 2) System.out.println("obrigado pela compra");

        } while (num == 1);

        System.out.println();

        System.out.printf(" Total geral: %.2f\n", totalGeral);
        System.out.printf(" Total desconto: %.2f", totalDesconto);
    }

}
