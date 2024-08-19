public class TestaTriangulo {
    public static void main(String[] args) {
        Triangulo coisa = new Triangulo(); // cria um objeto tipo triangulo e coloca na ariavel "coisa"

        coisa.a = 2;
        coisa.b = 3;
        coisa.c = 4;

        if (coisa.éTriangulo()) {
            System.out.println(" é um triangulo ");

            if (coisa.éEquilátero()) System.out.println("Equilátero");
            if (coisa.éIsosceles()) System.out.println("isosceles");
            if (coisa.éEscaleno()) System.out.println("escaleno");
            System.out.println( "O perímetro é: " + coisa.perimetro());
            System.out.println( " A area é " + coisa.area());

        } else {
                System.out.println(" não é um triangulo ");
            }
        }
    }
