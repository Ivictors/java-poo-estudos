package victorexercicios2.poo.interfaces.teste;

import victorexercicios2.poo.interfaces.dominio.FuncionarioCLT;
import victorexercicios2.poo.interfaces.dominio.FuncionarioPJ;

public class FuncionariosTeste {
    public static void main(String[] args) {
        FuncionarioPJ funcionarioPJ = new FuncionarioPJ("Jose", 1500);
        System.out.println("Salario " + funcionarioPJ.getpagamento());
        System.out.println("Salario + bonus " + funcionarioPJ.calcularSalarioFinal());

        FuncionarioCLT funcionarioCLT = new FuncionarioCLT("Maria", 5000);
        System.out.println("Salario " + funcionarioCLT.getpagamento());
        System.out.println("Salario + bonus " + funcionarioCLT.calcularSalarioFinal());
    }
}
