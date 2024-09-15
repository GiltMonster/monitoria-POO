import classes.Pessoa;
import classes.Veiculo;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Vamos criar um objeto do tipo Veiculo, que é uma classe que criamos em classes/Veiculo.java
        Veiculo carro1 = new Veiculo("Porsche", "911", 1990, "Branco", 759.900);
        Veiculo carro2 = new Veiculo("Hyundai", "hb20", 2024, "Preto", 92.990);

        // Agoras vamos criar um objeto do tipo Pessoa, que é uma classe que criamos em classes/Pessoa.java
        Pessoa pessoa1 = new Pessoa("Lucas", "Santos", 20, "123.456.789-00");

        // Agora que os veiculos existem o Lucas pode comprar um veiculo (Quem dera fosse assim na vida real)
        pessoa1.comprarVeiculo(carro1);
        pessoa1.comprarVeiculo(carro2);

        // Vamos listar os veiculos do Lucas
        pessoa1.listarVeiculos();

        // Agora vamos falar que o Lucas passou por dificuldades financeiras e teve que vender o Porsche
        pessoa1.venderVeiculo(carro1);

        // Vamos listar os veiculos do Lucas apos a triste venda de sua Porsche
        pessoa1.listarVeiculos();

        // As informações do Lucas e seus veiculos
        System.out.print(pessoa1);
    }
}