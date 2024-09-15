package classes;

public class Motocicleta extends Veiculo{

    public String tipo;
    public int cilindradas;
    public String tipoCombustivel;
    public int qntRodas;
    public int qntPessoas;
    public boolean isEletrica;

    public Motocicleta(String marca, String modelo, int ano, String cor, double preco, String tipo, int cilindradas, String tipoCombustivel, int qntRodas, int qntPessoas, boolean isEletrica) {
        super(marca, modelo, ano, cor, preco);
        this.tipo = tipo;
        this.cilindradas = cilindradas;
        this.tipoCombustivel = tipoCombustivel;
        this.qntRodas = qntRodas;
        this.qntPessoas = qntPessoas;
        this.isEletrica = isEletrica;
    }
}
