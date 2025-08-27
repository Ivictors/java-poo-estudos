package victorexercicios2.poo.interfaces.dominio;

public class FuncionarioPJ extends Funcionario {
    double bonus;

    public FuncionarioPJ(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double getpagamento() {
        return salarioBase;
    }

    @Override
    public double calcularSalarioFinal() {
        if (salarioBase <= 0) {
            System.out.println("Valor de salario invalido");
        } else if (salarioBase <= 1518.0) {
            bonus = 0.075;
        } else if (salarioBase > 1518.0 && salarioBase <= 2793.88) {
            bonus = 0.09;
        } else if (salarioBase > 2793.88 && salarioBase <= 4190.83) {
            bonus = 0.12;
        } else if (salarioBase > 4190.83) {
            bonus = 0.14;
        } else System.out.println("Valor invalido.");
        return salarioBase + (salarioBase * bonus);
    }
}
