import java.util.Scanner;

// pedir 3 numeros a, b, c e imprimir em ordem crescente
public class Decisao10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int A, B, C;
        System.out.println(" Digite 3 numeros separados por espaço ");
        A = teclado.nextInt();
        B = teclado.nextInt();
        C = teclado.nextInt();

        if ((A >= B) && (A >= C) && (B >= C)) {
            System.out.printf(" 1 -  Os numeros em ordem crescente são %d %d %d", C, B, A);
        }

        else if ((A >= B) && (A >= C) && (C >= B)) {
            System.out.printf(" 2 - Os numeros em ordem crescente são %d% d %d", B, C, A);
        }
        else if ((B >= A) && (B >= C) && (A >= C)) {
            System.out.printf(" 3 - Os numeros em ordem crescente são %d %d %d", C, A, B);
        }
        else if ((B >= A) && (B >= C) && (C >= A)) {
            System.out.printf(" 4 Os numeros em ordem crescente são %d %d %d ", A , C, B);
        }
        else if ((C >= A) && (C >= B) && (A >= B)) {
            System.out.printf(" 5 Os numeros em ordem crescente são %d %d %d" , B, A,  C);
        }
        else if ((C>=A) && (C>=B) && (B>=A)){
            System.out.printf(" 6 Os numeros em ordem crescente são %d %d %d\n", A, B, C);
        }
        }
}
