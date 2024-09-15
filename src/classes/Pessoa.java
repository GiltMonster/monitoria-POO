package classes;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    public String nome;
    public String sobrenome;
    public int idade;
    public String cpf;
    public List<Veiculo> veiculos;

    // Construtor da classe Pessoa
    public Pessoa(String nome, String sobrenome, int idade, String cpf) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.cpf = cpf;
        this.veiculos = new ArrayList<Veiculo>();
        //Note que estamos inicializando a lista de veiculos com um ArrayList. O ArrayList é uma implementação da interface List de Java que é uma lista de tamanho dinamico
    }

    // Adiciona o veiculo na lista de veiculos
    public void comprarVeiculo(Veiculo veiculo) {
        veiculos.add(veiculo);
        System.out.println("Parabens por comprar um " + veiculo.marca + " como o seu " + veiculos.size() + "º veiculo");
    }

    // Remove o veiculo da lista de veiculos
    public void venderVeiculo(Veiculo veiculo) {
        System.out.println("Vendendo veiculo " + veiculo.marca + " " + veiculo.modelo);
        veiculos.remove(veiculo);
    }

    // Percorre a lista de veiculos e imprime a marca e modelo de cada veiculo
    public void listarVeiculos() {
        for (Veiculo veiculo : veiculos) {
            System.out.println( veiculo.marca + " " + veiculo.modelo);
        }
    }

    // Retorna uma string com as informações da pessoa
    @Override
    public String toString() {
        return "\n Pessoa: {" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", idade=" + idade +
                ", cpf='" + cpf + '\'' +
                ", veiculos=" + veiculos.toString() +
                '}';
    }
}
