package victorexercicios2.poo.treinotopicos.teste;
import victorexercicios2.poo.treinotopicos.dominio.ContaCorrente;
import victorexercicios2.poo.treinotopicos.dominio.ContaPoupanca;
import victorexercicios2.poo.treinotopicos.dominio.MetodoPagamento;

public class SistemaBancoTest {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente("Harvey", 123456, 1000.00, MetodoPagamento.PIX);
        ContaPoupanca contaPoupanca = new ContaPoupanca("Mike", 98765, 2000.00, MetodoPagamento.BOLETO);

        System.out.println("--- Testando Conta Corrente ---");
        try {
            System.out.println("Saldo inicial: R$" + contaCorrente.consultarSaldo());
            contaCorrente.depositar(100.00);
            System.out.println("Depósito de R$100.00 realizado. Saldo atual: R$" + contaCorrente.consultarSaldo());
            contaCorrente.sacar(10.00);
            System.out.println("Saque de R$10.00 realizado. Saldo atual: R$" + contaCorrente.consultarSaldo());
            contaCorrente.imprimirExtrato();

            System.out.println("--- Tentando sacar R$1500.00 ---");
            contaCorrente.sacar(1500.00);
        } catch (IllegalArgumentException | IllegalStateException e) {
            System.err.println("Erro na transação: " + e.getMessage());
        }

        System.out.println("\n--- Testando Conta Poupança ---");
        try {
            System.out.println("Saldo inicial: R$" + contaPoupanca.consultarSaldo());
            contaPoupanca.depositar(200.00);
            System.out.println("Depósito de R$200.00 realizado. Saldo atual: R$" + contaPoupanca.consultarSaldo());
            contaPoupanca.sacar(400.00);
            System.out.println("Saque de R$400.00 realizado. Saldo atual: R$" + contaPoupanca.consultarSaldo());
            contaPoupanca.imprimirExtrato();

            System.out.println("--- Tentando sacar R$600.00 ---");
            contaPoupanca.sacar(600.00);
        } catch (IllegalArgumentException | IllegalStateException e) {
            System.err.println("Erro na transação: " + e.getMessage());
        }
    }
}
