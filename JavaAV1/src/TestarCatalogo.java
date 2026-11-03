
public class TestarCatalogo {

    public static void main(String[] args) {

        // Criando o catálogo
        Catalogo catalogo = new Catalogo();

        // Criando livros
        Livro livro1 = new Livro(
                "Java Básico", "João Silva", 180, 50.0
        );

        Livro livro2 = new Livro(
                "Python Fácil", "Maria Souza", 250, 60.0
        );

        Livro livro3 = new Livro(
                "Banco de Dados", "Pedro Lima", 300, 80.0
        );

        // Adicionando livros ao catálogo
        catalogo.adicionarLivro(livro1);
        catalogo.adicionarLivro(livro2);
        catalogo.adicionarLivro(livro3);

        // Exibindo catálogo
        System.out.println("\nCATÁLOGO COMPLETO:");
        catalogo.imprimirCatalogo();

        // Buscando livro
        System.out.println("\nBUSCANDO LIVRO:");

        Livro encontrado = catalogo.buscarLivro("Java Básico");

        if (encontrado != null) {
            System.out.println("Livro encontrado!");
            encontrado.exibirDetalhes();
        } else {
            System.out.println("Livro não encontrado!");
        }
    }
}
