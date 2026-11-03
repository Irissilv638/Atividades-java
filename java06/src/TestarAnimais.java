public class TestarAnimais {

    public static void main(String[] args) {

        // Criando o objeto Camelo
        Animal camelo = new Animal(
                "Camelo",
                150.0f,
                4,
                "Amarelo",
                "Terra",
                2.0f
        );

        // Criando o objeto Tubarão
        Peixe tubarao = new Peixe(
                "Tubarão",
                300.0f,
                0,
                "Cinzento",
                "Mar",
                1.5f,
                "Barbatanas e cauda"
        );

        // Criando o objeto Urso-do-canadá
        Mamifero ursoCanada = new Mamifero(
                "Urso-do-canadá",
                180.0f,
                4,
                "Vermelho",
                "Terra",
                0.5f,
                "Mel"
        );

        // Imprimindo os dados do Camelo
        System.out.println("===== CAMELO =====");
        camelo.imprimirDados();

        System.out.println();

        // Imprimindo os dados do Tubarão
        System.out.println("===== TUBARÃO =====");
        tubarao.imprimirDados();

        System.out.println();

        // Imprimindo os dados do Urso
        System.out.println("===== URSO-DO-CANADÁ =====");
        ursoCanada.imprimirDados();
    }
}