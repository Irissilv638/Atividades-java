
public abstract class Contribuinte {

    protected String nome;
    protected double rendaBruta;

    // Construtor
    public Contribuinte(String nome, double rendaBruta) {
        this.nome = nome;
        this.rendaBruta = rendaBruta;
    }

    // Cria a lista de contribuintes
    public static Contribuinte[] listaContr() {

        Contribuinte[] lst = new Contribuinte[6];

        lst[0] = new PFisica("Joao Santos", 3000.00, "11111");
        lst[1] = new PJuridica("Lojas AA", 150000.00, "10055");
        lst[2] = new PFisica("Maria Soares", 5000.00, "22222");
        lst[3] = new PJuridica("Supermercados B", 200000.00, "10066");
        lst[4] = new PFisica("Carla Maia", 1500.00, "33333");
        lst[5] = new PJuridica("Posto XX", 500000.00, "10077");

        return lst;
    }

    // Getter do nome
    public String getNome() {
        return nome;
    }

    // Getter da renda bruta
    public double getRendaBruta() {
        return rendaBruta;
    }

    // Método abstrato
    public abstract double calcImposto();
}

