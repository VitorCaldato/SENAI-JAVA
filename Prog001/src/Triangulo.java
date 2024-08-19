/* objeto que guarda os lados do triangulo

 */

public class Triangulo {
    int a, b, c;

    public boolean éTriangulo() { // retorna true se for triangulo ou falso se não triangulo
        return (a < b + c && b < c + a && c < a + b);
    }

    public boolean éEquilátero() {
        return (a == b && b == c); // retorna true se for equilateri
    }

    public boolean éIsosceles() {
        return !éEquilátero() && (a == b || a == c || b==c);
    }

    public boolean éEscaleno() {
        return !éEquilátero() && !éIsosceles();
    }

    public double perimetro(){
        return a + b + c;
    }
    public double area(){
        double p = perimetro()/2.0;
        return Math.sqrt( p * (p-a) * (p-b) * (p-c) ); //Math.sqrt é raiz quadrada
    }



}