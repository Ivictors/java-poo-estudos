package victorexercicios1.javacore.classes.dominio;

public class ConversorMonetario {
    public static double DOLLAR = 5.50;
    public static double EURO = 6.33;

    public double conversorDollar (double x){
        return x * DOLLAR;
    }
    public double conversorEuro (double y){
        return y * EURO;
    }
}
