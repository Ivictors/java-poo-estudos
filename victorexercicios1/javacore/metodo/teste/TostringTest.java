package victorexercicios1.javacore.metodo.teste;

import victorexercicios1.javacore.metodo.dominio.Tostring;

public class TostringTest {
    public static void main(String[] args) {
        Tostring teste1 = new Tostring();
        teste1.setNome("victor");

        System.out.println(teste1.toString());
    }
}
