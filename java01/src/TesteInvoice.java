public class TesteInvoice {

    public static void main(String[] args) {

        Invoice fatura = new Invoice(101, "Teclado", 2, 50.00);

        System.out.println("Número do item: " + fatura.getNumeroItem());
        System.out.println("Descrição: " + fatura.getDescricao());
        System.out.println("Quantidade: " + fatura.getQuantidade());
        System.out.println("Preço unitário: R$ " + fatura.getPrecoUnitario());

        System.out.println("Valor total da fatura: R$ "
                + fatura.getInvoiceAmount());

    }
}
