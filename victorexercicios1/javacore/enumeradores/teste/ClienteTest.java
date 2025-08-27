package victorexercicios1.javacore.enumeradores.teste;


import victorexercicios1.javacore.enumeradores.dominio.Cliente;
import victorexercicios1.javacore.enumeradores.dominio.TiposCliente;

public class ClienteTest {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Naruto", TiposCliente.PESSOA_FISICA);
        Cliente cliente2 = new Cliente("Sasuke", TiposCliente.PESSOA_JURIDICA);
        System.out.println(cliente1);
        System.out.println(cliente2);
    }
}
