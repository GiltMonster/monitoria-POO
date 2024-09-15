import classes.Carro;
import classes.Motocicleta;
import classes.Pessoa;
import classes.Veiculo;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Antes a gente trabalhava com um objetos do tipo Veiculo para representar os carros
//        Veiculo carro1 = new Veiculo("Porsche", "911", 1990, "Branco", 759.900);
//        Veiculo carro2 = new Veiculo("Hyundai", "hb20", 2024, "Preto", 92.990);
//        Veiculo carro3 = new Veiculo("Fiat", "Uno", 1990, "Vermelho", 9.900);
//        Veiculo carro4 = new Veiculo("Ford", "Ka", 1990, "Azul", 19.900);

        // Agora vamos trabalhar com objetos do tipo Carro e Motocicleta que herdam caracteristicas da classe Veiculo
        // Vamos criar um objeto do tipo Carro, que é uma classe que criamos em classes/Carro.java
        Carro carro1 = new Carro("Porsche", "911", 1990, "Branco", 759.900, "Não", 2, 2, "Gasolina", 4);
        Carro carro2 = new Carro("Hyundai", "hb20", 2024, "Preto", 92.990, "Não", 4, 5, "Flex", 4);
        Carro carro3 = new Carro("Fiat", "Uno", 1990, "Vermelho", 9.900, "Não", 2, 4, "Gasolina", 4);
        Carro carro4 = new Carro("Ford", "Ka", 1990, "Azul", 19.900, "Não", 4, 5, "Flex", 4);

        // Vamos criar um objeto do tipo Motocicleta, que é uma classe que criamos em classes/Motocicleta.java
        Motocicleta moto1 = new Motocicleta("Kawasaki", "Ninja 400", 2020, "Verde", 30.000, "Esportiva", 400, "Gasolina", 2, 2, false);
        Motocicleta moto2 = new Motocicleta("Yamaha", "MT-03", 2020, "Azul", 23.000, "Naked", 300, "Gasolina", 2, 2, false);
        Motocicleta moto3 = new Motocicleta("Harley Davidson", "Iron 883", 2020, "Preto", 50.000, "Custom", 883, "Gasolina", 2, 2, false);
        Motocicleta moto4 = new Motocicleta("Honda", "CG 160", 2020, "Vermelha", 12.000, "Street", 160, "Flex", 2, 2, false);

        // Agoras vamos criar um objeto do tipo Pessoa, que é uma classe que criamos em classes/Pessoa.java
        Pessoa pessoa1 = new Pessoa("Lucas", "Santos", 20, "123.456.789-00");
        Pessoa pessoa2 = new Pessoa("Joao", "Silva", 30, "987.654.321-00");

        // Agora que os veiculos existem o Lucas pode comprar um veiculo (Quem dera fosse assim na vida real)
        pessoa1.comprarVeiculo(carro1);
        pessoa1.comprarVeiculo(moto1);

        // Joao comprando um veiculo
        pessoa2.comprarVeiculo(moto3);
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