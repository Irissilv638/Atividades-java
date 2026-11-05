
public class Movimento implements MovimentoConta {

    private String cpfCorrentista;
    private float valorMovimento;

    public Movimento(String cpfCorrentista, float valorMovimento) {
        this.cpfCorrentista = cpfCorrentista;
        this.valorMovimento = valorMovimento;
    }

    @Override
    public String getCPFCorrentista() {
        return cpfCorrentista;
    }

    @Override
    public float getValorMovimento() {
        return valorMovimento;
    }
}
