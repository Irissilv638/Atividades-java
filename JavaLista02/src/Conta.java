public class Conta {

    private String nomeTitular;
    private int numero;
    private String agencia;
    private double saldo;
    private Data dataAbertura;

    // Construtor
    public Conta(String nomeTitular, int numero,
                 String agencia, double saldo, Data dataAbertura) {

        this.nomeTitular = nomeTitular;
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
        this.dataAbertura = dataAbertura;
    }

    // Método sacar
    public void sacar(double valor) {

        if (valor > 0 && valor <= saldo) {
            saldo = saldo - valor;
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Saque inválido!");
        }
    }

    // Método depositar
    public void depositar(double valor) {

        if (valor > 0) {
            saldo = saldo + valor;
            System.out.println("Depósito realizado com sucesso!");
        } else {
            System.out.println("Depósito inválido!");
        }
    }

    // Método calcular rendimento
    public double calcularRendimento() {
        return saldo * 0.1;
    }

    // Método recuperar dados para impressão
    public String recuperaDadosParaImpressao() {

        return "DADOS DA CONTA\n\n" +
                "Nome do titular: " + nomeTitular +
                "\nNúmero: " + numero +
                "\nAgência: " + agencia +
                "\nSaldo: R$ " + saldo +
                "\nData de abertura: " + dataAbertura;
    }
}