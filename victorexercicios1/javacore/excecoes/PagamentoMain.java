package victorexercicios1.javacore.excecoes;

public class PagamentoMain {
    public static void main(String[] args) {
        Pagamento pagamento = new Pagamento();
        Pagamento.efetuarPagamento(3000.00,2000.00);
        Pagamento.efetuarPagamento(1000.00,2000.00);
    }
}
