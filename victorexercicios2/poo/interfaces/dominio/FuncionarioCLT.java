package victorexercicios2.poo.interfaces.dominio;


public class FuncionarioCLT extends Funcionario {
    double descontoINSS;

    public FuncionarioCLT(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalarioFinal() {
        if (salarioBase <= 0) {
            System.out.println("Valor de salario invalido");
            return 0; // Ou lançar uma exceção
        }
        double descontoINSS;
        if (salarioBase <= 1518.0) {
            descontoINSS = 0.075;
        } else if (salarioBase <= 2793.88) {
            descontoINSS = 0.09;
        } else if (salarioBase <= 4190.83) {
            descontoINSS = 0.12;
        } else {
            descontoINSS = 0.14;
        }
        return salarioBase - (salarioBase * descontoINSS);
    }
    @Override
    public double getpagamento() {
        return salarioBase;
    }
}
