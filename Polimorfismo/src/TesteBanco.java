
public class TesteBanco {

    public static void main(String[] args) {

        // Criando os correntistas
        Correntista[] C = new Correntista[3];

        C[0] = new Correntista("111", 1000.0f);
        C[1] = new Correntista("222", 2000.0f);
        C[2] = new Correntista("333", 1500.0f);

        // Criando os movimentos
        MovimentoConta[] M = new MovimentoConta[4];

        M[0] = new Movimento("111", 500.0f);
        M[1] = new Movimento("222", -300.0f);
        M[2] = new Movimento("333", 200.0f);
        M[3] = new Movimento("111", -100.0f);

        // Criando o objeto de operações bancárias
        OperacoesBanco operacoes = new OperacoesBancoImpl();

        // Atualizando os saldos
        ProcessadorMovimentos.atualizarSaldos(
                C,
                M,
                operacoes
        );

        // Exibindo os saldos atualizados
        System.out.println("SALDOS ATUALIZADOS");
        System.out.println("-------------------------");

        for (int i = 0; i < C.length; i++) {

            System.out.println(
                    "CPF: " + C[i].getCPFCliente()
                            + " | Saldo: R$ " + C[i].getSaldo()
            );
        }
    }
}
