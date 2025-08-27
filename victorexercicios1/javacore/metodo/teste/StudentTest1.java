package victorexercicios1.javacore.metodo.teste;

import victorexercicios1.javacore.metodo.dominio.Impressora;
import victorexercicios1.javacore.metodo.dominio.Student1;

public class StudentTest1 {
    public static void main(String[] args) {
        Student1 students = new Student1();

        students.name = "Heloisa";
        students.age = 15;
        students.sex = 'F';

        Impressora impressora = new Impressora();
        impressora.imprimir(students);

        students.imprime();
    }
}
