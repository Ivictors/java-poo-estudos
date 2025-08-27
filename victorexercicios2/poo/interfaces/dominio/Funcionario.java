package victorexercicios2.poo.interfaces.dominio;

public abstract class  Funcionario implements Pagavel {
    String nome;
    double salarioBase;

    public abstract double calcularSalarioFinal ();

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }
}
