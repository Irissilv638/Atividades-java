public class Animal {

    private String nome;
    private float comprimento;
    private int numeroPatas;
    private String cor;
    private String ambiente;
    private float velocidadeMedia;

    // Construtor
    public Animal(String nome, float comprimento, int numeroPatas,
                  String cor, String ambiente, float velocidadeMedia) {

        this.nome = nome;
        this.comprimento = comprimento;
        this.numeroPatas = numeroPatas;
        this.cor = cor;
        this.ambiente = ambiente;
        this.velocidadeMedia = velocidadeMedia;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public float getComprimento() {
        return comprimento;
    }

    public int getNumeroPatas() {
        return numeroPatas;
    }

    public String getCor() {
        return cor;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public float getVelocidadeMedia() {
        return velocidadeMedia;
    }

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }

    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public void setVelocidadeMedia(float velocidadeMedia) {
        this.velocidadeMedia = velocidadeMedia;
    }

    // Método para imprimir os dados
    public void imprimirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Comprimento: " + comprimento + " cm");
        System.out.println("Número de patas: " + numeroPatas);
        System.out.println("Cor: " + cor);
        System.out.println("Ambiente: " + ambiente);
        System.out.println("Velocidade média: " + velocidadeMedia + " m/s");
    }
}
