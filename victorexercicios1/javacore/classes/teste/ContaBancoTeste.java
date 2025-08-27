package victorexercicios1.javacore.classes.teste;


import victorexercicios1.javacore.classes.dominio.ContaBanco;

public class ContaBancoTeste {
    public static void main(String[] args) {
        ContaBanco cliente1 = new ContaBanco("Jose",12340000);
        ContaBanco cliente2 = new ContaBanco("Maria",12340101,1000.0);

        cliente1.setNome("Jose Souza");
        cliente1.deposito(1200.0);
        cliente1.saque(200.0);

        cliente2.setNome("Maria Souza");
        cliente2.deposito(1200.0);
        cliente2.saque(200.0);

        System.out.println(cliente1);
        System.out.println(cliente2);
    }
}
