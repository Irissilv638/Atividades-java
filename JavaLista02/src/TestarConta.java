import java.util.Scanner;

public class TestarConta {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // Recebendo os dados do titular
        System.out.print("Digite o nome do titular: ");
        String nome = entrada.nextLine();

        System.out.print("Digite o número da conta: ");
        int numero = entrada.nextInt();
        entrada.nextLine();

        System.out.print("Digite a agência: ");
        String agencia = entrada.nextLine();

        System.out.print("Digite o saldo inicial: ");
        double saldo = entrada.nextDouble();

        // Recebendo a data de abertura
        System.out.print("Digite o dia de abertura: ");
        int dia = entrada.nextInt();

        System.out.print("Digite o mês de abertura: ");
        int mes = entrada.nextInt();

        System.out.print("Digite o ano de abertura: ");
        int ano = entrada.nextInt();

        // Criando o objeto Data
        Data data = new Data(dia, mes, ano);

        // Criando o objeto Conta
        Conta conta = new Conta(nome, numero, agencia, saldo, data);

        // Realizando um depósito
        System.out.print("Digite o valor do depósito: ");
        double deposito = entrada.nextDouble();

        conta.depositar(deposito);

        // Realizando um saque
        System.out.print("Digite o valor do saque: ");
        double saque = entrada.nextDouble();

        conta.sacar(saque);

        // Exibindo os dados da conta
        System.out.println("\n" + conta.recuperaDadosParaImpressao());

        // Exibindo o rendimento
        System.out.println("\nRendimento: R$ " +
                conta.calcularRendimento());

        entrada.close();
    }
}