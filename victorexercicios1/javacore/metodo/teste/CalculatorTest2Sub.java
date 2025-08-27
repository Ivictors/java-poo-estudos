package victorexercicios1.javacore.metodo.teste;

import victorexercicios1.javacore.metodo.dominio.Calculator2;

public class CalculatorTest2Sub {
    public static void main(String[] args) {
        Calculator2 vRef = new Calculator2();

        int result = vRef.number(10, 2);

        System.out.println(result);
    }
}
