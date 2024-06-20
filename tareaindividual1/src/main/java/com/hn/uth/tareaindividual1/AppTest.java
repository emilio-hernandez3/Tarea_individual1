public class App {
    public static double calcularAreaCirculo(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }

    public static double calcularAreaCuadrado(double lado) {
        return Math.pow(lado, 2);
    }

    public static double calcularAreaRectangulo(double base, double altura) {
        return base * altura;
    }

    public static double calcularAreaTriangulo(double base, double altura) {
        return 0.5 * base * altura;
    }
}