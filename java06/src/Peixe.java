public class Peixe extends Animal {

    private String caracteristica;

    // Construtor
    public Peixe(String nome, float comprimento, int numeroPatas,
                 String cor, String ambiente, float velocidadeMedia,
                 String caracteristica) {

        super(nome, comprimento, numeroPatas, cor, ambiente, velocidadeMedia);

        this.caracteristica = caracteristica;
    }

    // Getter
    public String getCaracteristica() {
        return caracteristica;
    }

    // Setter
    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }

    // Método para imprimir os dados do peixe
    public void imprimirDados() {
        super.imprimirDados();
        System.out.println("Característica: " + caracteristica);
    }
}