package victorexercicios2.poo.constantes;

public class Constantes {
    final double PI = 3.14159;
    public double perimetro;

    public double calcularCircunferencia(double raio) {
        this.perimetro = 2 * PI * raio;
        return perimetro;
    }
    public void imprimi(){
        System.out.println(perimetro);
    }
}
