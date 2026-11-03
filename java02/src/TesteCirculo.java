public class TesteCirculo {
    public static void main(String[] args) {

        Ponto ponto1 = new Ponto(3, 4);

        Circulo circulo1 = new Circulo(ponto1, 5);

        Circulo circulo2 = new Circulo(10, 2, 6);

        System.out.println("CIRCULO 1");
        System.out.println("Origem X: " + ponto1.getX());
        System.out.println("Origem Y: " + ponto1.getY());
        System.out.println("Area: " + circulo1.calcularArea());
        System.out.println("Circunferencia: "
                + circulo1.calcularCircunferencia());

        System.out.println();

        System.out.println("CIRCULO 2");
        System.out.println("Area: " + circulo2.calcularArea());
        System.out.println("Circunferencia: "
                + circulo2.calcularCircunferencia());
    }
}