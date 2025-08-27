package victorexercicios2.poo.abstrata.teste;

import victorexercicios2.poo.abstrata.dominio.Boleto;
import victorexercicios2.poo.abstrata.dominio.CartaoCredito;

public class PagamentosTeste {
    public static void main(String[] args) {
        CartaoCredito pagamento1 = new CartaoCredito();
        Boleto pagamento2 = new Boleto();

        pagamento1.processarPagamento();
        pagamento2.processarPagamento();
    }
}
