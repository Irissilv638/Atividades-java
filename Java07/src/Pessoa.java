
public class Pessoa {

    private String nome;
    private String endereco;
    private String telefone;

    // Construtor padrão
    public Pessoa() {
        this("", "", "");
    }

    // Construtor com três parâmetros
    public Pessoa(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    // Outro construtor
    public Pessoa(String nome, String telefone) {
        this(nome, "", telefone);
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
