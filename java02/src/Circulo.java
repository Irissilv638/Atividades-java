public class Circulo {
    private int raio;
    private Ponto origem;

    public Circulo(Ponto origem, int raio) {
        this.origem = origem;
        this.raio = raio;
    }

    public Circulo(int raio, int x, int y) {
        this.raio = raio;
        this.origem = new Ponto(x, y);
    }

    public double calcularArea() {
        return Math.PI * raio * raio;
    }

    public double calcularCircunferencia() {
        return 2 * Math.PI * raio;
    }
}