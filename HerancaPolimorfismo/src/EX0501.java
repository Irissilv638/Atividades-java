
public class EX0501 {

    public static void main(String[] args) {

        // Obtém a lista de contribuintes
        Contribuinte[] lst;

        lst = Contribuinte.listaContr();

        System.out.println("NOME                 IMPOSTO");
        System.out.println("------------------------------------------");

        // Percorre a lista e calcula o imposto
        for (int i = 0; i < lst.length; i++) {

            System.out.printf(
                    "%-20s R$ %9.2f%n",
                    lst[i].getNome(),
                    lst[i].calcImposto()
            );
        }
    }
}
