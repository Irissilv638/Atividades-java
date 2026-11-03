
public class TestarLivro {

    public static void main(String[] args) {

        // Questão 1: declaração de variáveis
        String titulo = "Java Básico";
        String autor = "João Silva";
        int paginas = 180;
        double preco = 50.0;
        boolean disponivel = true;

        // Questão 2: operações
        paginas = paginas + 20;
        preco = preco * 0.9;

        System.out.println("Páginas: " + paginas);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Disponível: " + disponivel);

        // Questão 3: classificação do livro
        if (paginas < 100) {
            System.out.println("Livro curto");
        } else if (paginas <= 300) {
            System.out.println("Livro médio");
        } else {
            System.out.println("Livro longo");
        }

        // Questão 4: repetição FOR
        System.out.println("\nFOR:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        // Questão 4: repetição WHILE
        System.out.println("\nWHILE:");
        int contador = 1;

        while (contador <= 5) {
            System.out.println(contador);
            contador++;
        }

        // Questões 5, 6 e 7: criação de objetos
        Livro livro1 = new Livro(
                "Java Básico", "João Silva", 180, 50.0
        );

        Livro livro2 = new Livro(
                "Python Fácil", "Maria Souza", 250, 60.0
        );

        System.out.println("\nDETALHES DO LIVRO:");
        livro1.exibirDetalhes();

        // Questão 8: aplicar desconto
        System.out.println("\nDESCONTO:");
        livro1.aplicarDesconto(10);

        // Questão 9: calcular preço com desconto
        double valorFinal = livro2.calcularPrecoComDesconto(20);
        System.out.println("Preço com desconto: R$ " + valorFinal);

        // Questão 10: duas referências para o mesmo objeto
        Livro a = livro1;
        Livro b = a;

        b.setTitulo("Java na Prática");

        System.out.println("\nREFERÊNCIAS:");
        System.out.println("Título pelo objeto a: " + a.getTitulo());
        System.out.println("Título pelo objeto b: " + b.getTitulo());

        // Questão 11: construtor com parâmetros
        Livro livro3 = new Livro(
                "Banco de Dados", "Pedro Lima", 300, 80.0
        );

        // Questões 12, 13 e 14: encapsulamento e getters/setters
        livro3.setPreco(90.0);
        System.out.println("\nPreço atualizado: R$ " + livro3.getPreco());

        // Questão 15: empréstimo e devolução
        System.out.println("\nEMPRÉSTIMO:");
        livro3.emprestar();
        System.out.println("Disponível: " + livro3.isDisponivel());

        livro3.devolver();
        System.out.println("Disponível: " + livro3.isDisponivel());

        // Questão 16: vetor de livros
        Livro[] listaLivros = new Livro[3];

        listaLivros[0] = livro1;
        listaLivros[1] = livro2;
        listaLivros[2] = livro3;

        System.out.println("\nVETOR DE LIVROS:");

        for (int i = 0; i < listaLivros.length; i++) {
            System.out.println(listaLivros[i].getTitulo());
        }

        // Questão 17: contar livros disponíveis
        int quantidadeDisponivel = 0;

        for (int i = 0; i < listaLivros.length; i++) {
            if (listaLivros[i].isDisponivel()) {
                quantidadeDisponivel++;
            }
        }

        System.out.println(
                "\nLivros disponíveis: " + quantidadeDisponivel
        );
    }
}
