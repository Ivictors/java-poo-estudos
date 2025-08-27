package victorexercicios2.poo.metodos;

public class CalcularDesconto {
    public double CalcularDesconto1(double valorOriginal, double percentualDesconto) {
        double desconto = 0, precoAtual = 0;
        if (percentualDesconto > 100 || percentualDesconto < 0) {
            System.out.println("Erro!!!");
            return valorOriginal;
        }
        desconto = valorOriginal * (percentualDesconto / 100);
        precoAtual = valorOriginal - desconto;
        System.out.println("Valor do produto: " + valorOriginal + " desconto " + percentualDesconto + " o total é: " + precoAtual);
        return precoAtual;
    }
}
