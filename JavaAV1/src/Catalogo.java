
public class Catalogo {
    private Livro[] livros;
    private int quantidade;

    public Catalogo() {
        livros = new Livro[5];
        quantidade = 0;
    }

    // Adiciona um livro ao catálogo
    public void adicionarLivro(Livro livro) {
        if (livro == null) {
            System.out.println("Livro inválido!");
            return;
        }

        if (quantidade < livros.length) {
            livros[quantidade] = livro;
            quantidade++;
            System.out.println("Livro adicionado ao catálogo!");
        } else {
            System.out.println("Catálogo cheio!");
        }
    }

    // Busca um livro pelo título
    public Livro buscarLivro(String titulo) {
        for (int i = 0; i < quantidade; i++) {
            if (livros[i].getTitulo().equalsIgnoreCase(titulo)) {
                return livros[i];
            }
        }

        return null;
    }

    // Imprime todos os livros
    public void imprimirCatalogo() {
        if (quantidade == 0) {
            System.out.println("O catálogo está vazio.");
            return;
        }

        for (int i = 0; i < quantidade; i++) {
            System.out.println("\nLivro " + (i + 1));
            livros[i].exibirDetalhes();
        }
    }
}
