package victorexercicios2.poo.treinotopicos.dominio;

public abstract class ContaBancaria {
        protected String titular;
        protected int numeroConta;
        protected double saldo;
        protected MetodoPagamento metodoPagamento;

    public ContaBancaria(String titular, int numeroConta, double saldo, MetodoPagamento metodoPagamento) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.metodoPagamento = metodoPagamento;
    }

    public abstract void imprimirExtrato();

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
