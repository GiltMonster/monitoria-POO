import classes.Pessoa;
import classes.Veiculo;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Vamos criar um objeto do tipo Veiculo, que é uma classe que criamos em classes/Veiculo.java
        Veiculo carro1 = new Veiculo("Porsche", "911", 1990, "Branco", 759.900);
        Veiculo carro2 = new Veiculo("Hyundai", "hb20", 2024, "Preto", 92.990);
        Veiculo carro3 = new Veiculo("Fiat", "Uno", 1990, "Vermelho", 9.900);
        Veiculo carro4 = new Veiculo("Ford", "Ka", 1990, "Azul", 19.900);

        // Agoras vamos criar um objeto do tipo Pessoa, que é uma classe que criamos em classes/Pessoa.java
        Pessoa pessoa1 = new Pessoa("Lucas", "Santos", 20, "123.456.789-00");
        Pessoa pessoa2 = new Pessoa("Joao", "Silva", 30, "987.654.321-00");

        // Agora que os veiculos existem o Lucas pode comprar um veiculo (Quem dera fosse assim na vida real)
        pessoa1.comprarVeiculo(carro1);
        pessoa1.comprarVeiculo(carro2);

        // Joao comprando um veiculo
        pessoa2.comprarVeiculo(carro3);
        pessoa2.comprarVeiculo(carro4);

        // Vamos listar os veiculos do Lucas
        pessoa1.listarVeiculos();

        // Vamos listar os veiculos do Joao
        pessoa2.listarVeiculos();

        // Agora vamos falar que o Lucas passou por dificuldades financeiras e teve que vender o Porsche
        pessoa1.venderVeiculo(carro1);

        // Vamos listar os veiculos do Lucas apos a triste venda de sua Porsche
        pessoa1.listarVeiculos();

        // Vamos vender o carro do Joao
        pessoa2.venderVeiculo(carro4);

        // As informações do Lucas e seus veiculos
        System.out.print(pessoa1);

        // As informações do Joao e seus veiculos
        System.out.print(pessoa2);
    }
}