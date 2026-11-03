
public class Livro {
    private String titulo;
    private String autor;
    private int paginas;
    private double preco;
    private boolean disponivel;

    // Construtor vazio
    public Livro() {
        this("", "", 0, 0.0);
    }

    // Construtor com parâmetros
    public Livro(String titulo, String autor, int paginas, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.preco = preco;
        this.disponivel = true;
    }

    // Getters
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public double getPreco() {
        return preco;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    // Setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setPaginas(int paginas) {
        if (paginas >= 0) {
            this.paginas = paginas;
        }
    }

    public void setPreco(double preco) {
        if (preco >= 0) {
            this.preco = preco;
        } else {
            System.out.println("Preço inválido!");
        }
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    // Exibe os detalhes do livro
    public void exibirDetalhes() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Páginas: " + paginas);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Disponível: " + disponivel);
    }

    // Aplica desconto diretamente ao preço
    public void aplicarDesconto(double percentual) {
        if (percentual >= 0 && percentual <= 100) {
            preco = preco - (preco * percentual / 100);
            System.out.println("Novo preço: R$ " + preco);
        } else {
            System.out.println("Desconto inválido!");
        }
    }

    // Calcula o preço com desconto sem alterar o preço original
    public double calcularPrecoComDesconto(double percentual) {
        if (percentual >= 0 && percentual <= 100) {
            return preco - (preco * percentual / 100);
        }

        return -1;
    }

    // Realiza empréstimo
    public void emprestar() {
        if (disponivel) {
            disponivel = false;
            System.out.println("Livro emprestado com sucesso!");
        } else {
            System.out.println("Livro indisponível para empréstimo.");
        }
    }

    // Realiza devolução
    public void devolver() {
        if (!disponivel) {
            disponivel = true;
            System.out.println("Livro devolvido com sucesso!");
        } else {
            System.out.println("O livro já está disponível.");
        }
    }
}
