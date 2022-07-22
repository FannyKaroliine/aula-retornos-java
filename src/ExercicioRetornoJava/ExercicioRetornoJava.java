package ExercicioRetornoJava;

public class ExercicioRetornoJava {
    public static void main(String[] args) {

        System.out.println("Exercicio retornos");

        double areaQuadrado = Quadrilateros.area(5);
        System.out.println("Área do quadrado: " + areaQuadrado);

        double areaRetangulo = Quadrilateros.area(10, 25);
        System.out.println("Área do retângulo: " + areaRetangulo);

        double areaTrapezio = Quadrilateros.area(13, 6, 10);
        System.out.println("Área do trapézio: " + areaTrapezio);

    }
}
