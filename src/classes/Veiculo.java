package classes;

public class Veiculo {
    public String marca;
    public String modelo;
    public int ano;
    public String cor;
    public double preco;

    // Construtor da classe Veiculo
    public Veiculo(String marca, String modelo, int ano, String cor, double preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.preco = preco;
    }

    // Metodo que simula o veiculo acelerando
    public void acelerar() {
        System.out.println("Acelerando...");
    }

    public void frear() {
        System.out.println("Freando...");
    }

    // Metodo que simula o veiculo freando
    @Override
    public String toString() {
        return "{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", ano=" + ano +
                ", cor='" + cor + '\'' +
                ", preco=" + preco +
                '}';
    }
}
