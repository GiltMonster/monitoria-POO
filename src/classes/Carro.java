package classes;

public class Carro extends Veiculo{

    public String isConvercivel;
    public int qntPortas;
    public int qntPessoas;
    public String tipoCombustivel;
    public int qntRodas;

    public Carro(String marca, String modelo, int ano, String cor, double preco, String isConvercivel, int qntPortas, int qntPessoas, String tipoCombustivel, int qntRodas) {
        super(marca, modelo, ano, cor, preco);
        this.isConvercivel = isConvercivel;
        this.qntPortas = qntPortas;
        this.qntPessoas = qntPessoas;
        this.tipoCombustivel = tipoCombustivel;
        this.qntRodas = qntRodas;
    }

    public void acelerar() {
        super.acelerar();
    }

    public void frear() {
        super.frear();
    }

}
