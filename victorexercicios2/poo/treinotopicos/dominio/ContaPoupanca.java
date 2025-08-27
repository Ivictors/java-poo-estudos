package victorexercicios2.poo.treinotopicos.dominio;

public class ContaPoupanca extends ContaBancaria implements Transacionavel{
    public ContaPoupanca(String titular, int numeroConta, double saldo, MetodoPagamento metodoPagamento) {
        super(titular, numeroConta, saldo, metodoPagamento);
    }

    @Override
    public void depositar(double valor) {
        if (valor < 30.00) {
            throw new IllegalArgumentException("Valor de deposito invalido. O valor deve ser de R$30,00 ou mais.");
        }
        this.saldo += valor;
    }

    @Override
    public void sacar(double valor) {
        if (valor > 500.00) {
            throw new IllegalArgumentException("Não foi possivel realizar transação, o valor excede o limite para saque de R$500,00.");
        }
        if (this.saldo < valor) {
            throw new IllegalStateException("Saldo insuficiente.");
        }
        this.saldo -= valor;
    }

    @Override
    public double consultarSaldo() {
        return this.saldo;
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("---------- Extrato de Conta Poupança ----------");
        System.out.println("Titular: " + this.titular);
        System.out.println("Número da Conta: " + this.numeroConta);
        System.out.printf("Saldo Atual: R$%.2f%n", this.saldo);
        System.out.println("----------------------------------------------");
    }
}
