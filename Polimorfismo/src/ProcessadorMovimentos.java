
public class ProcessadorMovimentos {

    public static void atualizarSaldos(
            Correntista[] C,
            MovimentoConta[] M,
            OperacoesBanco operacoes
    ) {

        if (C == null || M == null || operacoes == null) {
            return;
        }

        for (int i = 0; i < M.length; i++) {

            if (M[i] != null) {

                Correntista correntista =
                        operacoes.encontraCorrentista(
                                C,
                                M[i].getCPFCorrentista()
                        );

                if (correntista != null) {

                    float novoSaldo =
                            correntista.getSaldo()
                                    + M[i].getValorMovimento();

                    correntista.setSaldo(novoSaldo);
                }
            }
        }
    }
}
