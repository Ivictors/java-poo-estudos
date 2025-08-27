package victorexercicios2.poo.abstrata.dominio;

public class CartaoCredito extends Pagamento{
    @Override
    public void processarPagamento() {
        System.out.println("Pagamento via cartão de credito efetivado com sucesso!");
    }
}
