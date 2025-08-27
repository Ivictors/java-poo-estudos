package victorexercicios1.javacore.resourceb;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBTest {
    public static void main(String[] args) {
        ResourceBundle bundle = ResourceBundle.getBundle("messages", Locale.of("pt","BR"));
        System.out.println(bundle.getString("Ola"));
        System.out.println(bundle.getString("Good.bye"));
    }
}
