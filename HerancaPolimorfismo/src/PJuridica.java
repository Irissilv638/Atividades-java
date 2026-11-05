
public class PJuridica extends Contribuinte {

    protected String cnpj;

    public PJuridica(String n, double r, String c) {
        super(n, r);
        this.cnpj = c;
    }

    public String getCnpj() {
        return cnpj;
    }

    @Override
    public double calcImposto() {
        return rendaBruta * 0.10;
    }
}
