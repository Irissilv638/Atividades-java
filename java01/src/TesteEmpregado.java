public class TesteEmpregado {

    public static void main(String[] args) {

        // Criando duas instâncias
        Empregado empregado1 = new Empregado("João", "Silva", 2000.00);

        Empregado empregado2 = new Empregado("Maria", "Santos", 3000.00);

        // Exibindo salários anuais
        System.out.println("Empregado: "
                + empregado1.getPrimeiroNome() + " "
                + empregado1.getSobrenome());

        System.out.println("Salário anual: R$ "
                + empregado1.calcularSalarioAnual());

        System.out.println();

        System.out.println("Empregado: "
                + empregado2.getPrimeiroNome() + " "
                + empregado2.getSobrenome());

        System.out.println("Salário anual: R$ "
                + empregado2.calcularSalarioAnual());

        // Aumento de 10%
        empregado1.setSalarioMensal(
                empregado1.getSalarioMensal() * 1.10);

        empregado2.setSalarioMensal(
                empregado2.getSalarioMensal() * 1.10);

        // Exibindo os novos salários anuais
        System.out.println("\nApós o aumento de 10%:");

        System.out.println("Salário anual de "
                + empregado1.getPrimeiroNome() + ": R$ "
                + empregado1.calcularSalarioAnual());

        System.out.println("Salário anual de "
                + empregado2.getPrimeiroNome() + ": R$ "
                + empregado2.calcularSalarioAnual());
    }
}