package victorexercicios1.javacore.classes.dominio;

public class ContaBanco {
    private String nome;
    private int numeroConta;
    private double saldo;
    private double taxa = 5.0;

    public ContaBanco(String nome, int numeroConta) {
        this.nome = nome;
        this.numeroConta = numeroConta;
    }

    public ContaBanco(String nome, int numeroConta, double saldoInicial) {
        this.nome = nome;
        this.numeroConta = numeroConta;
        deposito(saldoInicial);
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
        System.out.println("Nome atualizado.");
    }

    public double getSaldo() {
        System.out.print("Saldo disponivel: ");
        return saldo;
    }

    public void deposito(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Deposito finalizado.");
        }else System.out.println("Operacao invalida.");
    }

    public void saque (double valor) {
        if (saldo >= (valor + taxa)) {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso.");
        } else if (valor <= 0) {
            System.out.println("Operação invalida!");
        } else System.out.println("Saldo insuficiente.");
    }

    @Override
    public String toString() {
        return "ContaBanco{" +
                "nome='" + nome + '\'' +
                ", numeroConta=" + numeroConta +
                ", saldo=" + saldo +
                ", taxa=" + taxa +
                '}';
    }
}
