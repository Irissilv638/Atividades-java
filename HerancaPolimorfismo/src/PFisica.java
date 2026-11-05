
public class PFisica extends Contribuinte {

    protected String cpf;

    public PFisica(String n, double r, String c) {
        super(n, r);
        this.cpf = c;
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public double calcImposto() {

        double renda = rendaBruta;

        if (renda <= 1400.00) {
            return 0.0;

        } else if (renda <= 2100.00) {
            return renda * 0.10 - 100.00;

        } else if (renda <= 2800.00) {
            return renda * 0.15 - 270.00;

        } else if (renda <= 3600.00) {
            return renda * 0.25 - 500.00;

        } else {
            return renda * 0.30 - 700.00;
        }
    }
}
