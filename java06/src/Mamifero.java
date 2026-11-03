public class Mamifero extends Animal {

    private String alimento;

    // Construtor
    public Mamifero(String nome, float comprimento, int numeroPatas,
                    String cor, String ambiente, float velocidadeMedia,
                    String alimento) {

        super(nome, comprimento, numeroPatas, cor, ambiente, velocidadeMedia);

        this.alimento = alimento;
    }

    // Getter
    public String getAlimento() {
        return alimento;
    }

    // Setter
    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    // Método para imprimir os dados do mamífero
    public void imprimirDados() {
        super.imprimirDados();
        System.out.println("Alimento: " + alimento);
    }
}