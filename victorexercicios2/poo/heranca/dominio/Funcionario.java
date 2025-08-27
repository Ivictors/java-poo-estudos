package victorexercicios2.poo.heranca.dominio;

public class Funcionario {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void imprimi() {
        System.out.println(nome);
        System.out.println(salario);
        System.out.println("Nome: " + this.nome + " salario: " + this.salario);
        System.out.println("---------------------------------------------------");
        System.out.println("seu bonus " + calcularBonus());
        System.out.println("-------------------proximo--------------------------------");
    }

    public double calcularBonus() {
        return salario * 0.10;
    }

}
