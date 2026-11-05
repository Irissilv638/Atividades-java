
public class OperacoesBancoImpl implements OperacoesBanco {

    @Override
    public Correntista encontraCorrentista(
            Correntista[] todosCorrentistas,
            String cpfProcurado
    ) {

        if (todosCorrentistas == null || cpfProcurado == null) {
            return null;
        }

        for (int i = 0; i < todosCorrentistas.length; i++) {

            if (todosCorrentistas[i] != null &&
                    todosCorrentistas[i].getCPFCliente().equals(cpfProcurado)) {

                return todosCorrentistas[i];
            }
        }

        return null;
    }
}
