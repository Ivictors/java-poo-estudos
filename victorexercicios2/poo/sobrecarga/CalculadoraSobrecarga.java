package victorexercicios2.poo.sobrecarga;

public class CalculadoraSobrecarga {
    public int somar(int a, int b) {
        return a + b;
    }

    public double somar(double a, double b) {
        return a + b;
    }
    public int somar (int a, int b, int c) {
        return a + b + c;
    }
    public String somar (String a, String b) {
        return a + b;
    }
}