
public class TesteHeranca {

    public static void main(String[] args) {

        // QUESTÃO 1 - Testando Pessoa
        Pessoa pessoa = new Pessoa(
                "Ana Silva",
                "Rua das Flores, 100",
                "71999999999"
        );

        System.out.println("===== PESSOA =====");
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Endereço: " + pessoa.getEndereco());
        System.out.println("Telefone: " + pessoa.getTelefone());


        // QUESTÃO 2 - Testando Fornecedor
        Fornecedor fornecedor = new Fornecedor(
                "Carlos Souza",
                "Rua Central, 200",
                "71988888888",
                10000.0,
                3500.0
        );

        System.out.println("\n===== FORNECEDOR =====");
        System.out.println("Nome: " + fornecedor.getNome());
        System.out.println("Crédito: R$ " + fornecedor.getValorCredito());
        System.out.println("Dívida: R$ " + fornecedor.getValorDivida());
        System.out.println("Saldo: R$ " + fornecedor.obterSaldo());


        // QUESTÃO 3 - Testando Empregado
        Empregado empregado = new Empregado(
                "Maria Oliveira",
                "Rua A, 50",
                "71977777777",
                10,
                3000.0,
                10.0
        );

        System.out.println("\n===== EMPREGADO =====");
        System.out.println("Nome: " + empregado.getNome());
        System.out.println("Código do setor: " + empregado.getCodigoSetor());
        System.out.println("Salário-base: R$ " + empregado.getSalarioBase());
        System.out.println("Imposto: " + empregado.getImposto() + "%");
        System.out.println("Salário calculado: R$ " + empregado.calcularSalario());


        // QUESTÃO 4 - Testando Administrador
        Administrador administrador = new Administrador(
                "João Santos",
                "Rua B, 80",
                "71966666666",
                20,
                4000.0,
                10.0,
                800.0
        );

        System.out.println("\n===== ADMINISTRADOR =====");
        System.out.println("Nome: " + administrador.getNome());
        System.out.println("Ajuda de custo: R$ " + administrador.getAjudaDeCusto());
        System.out.println("Salário calculado: R$ " + administrador.calcularSalario());


        // QUESTÃO 5 - Testando Operario
        Operario operario = new Operario(
                "Pedro Lima",
                "Rua C, 90",
                "71955555555",
                30,
                2500.0,
                10.0,
                10000.0,
                5.0
        );

        System.out.println("\n===== OPERÁRIO =====");
        System.out.println("Nome: " + operario.getNome());
        System.out.println("Valor da produção: R$ " + operario.getValorProducao());
        System.out.println("Comissão: " + operario.getComissao() + "%");
        System.out.println("Salário calculado: R$ " + operario.calcularSalario());


        // QUESTÃO 6 - Testando Vendedor
        Vendedor vendedor = new Vendedor(
                "Lucas Ferreira",
                "Rua D, 120",
                "71944444444",
                40,
                2800.0,
                10.0,
                20000.0,
                3.0
        );

        System.out.println("\n===== VENDEDOR =====");
        System.out.println("Nome: " + vendedor.getNome());
        System.out.println("Valor das vendas: R$ " + vendedor.getValorVendas());
        System.out.println("Comissão: " + vendedor.getComissao() + "%");
        System.out.println("Salário calculado: R$ " + vendedor.calcularSalario());
    }
}
