package victorexercicios2.poo.abstrata.dominio;

public class Boleto extends Pagamento{
    @Override
    public void processarPagamento() {
        System.out.println("Pagamento via boleto efetivado com sucesso!");
    }
}
