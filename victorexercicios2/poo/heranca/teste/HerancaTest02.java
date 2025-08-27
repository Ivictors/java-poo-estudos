package victorexercicios2.poo.heranca.teste;

import victorexercicios2.poo.heranca.dominio.Carro;
import victorexercicios2.poo.heranca.dominio.Moto;


public class HerancaTest02 {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Volkswagem","Nivus",2024,4);
        Moto moto1 = new Moto("Honda", "Cg",2022,160);

        carro1.exibirInfo();
        System.out.println("-------------------------");
        moto1.exibirInfo();
    }
}
