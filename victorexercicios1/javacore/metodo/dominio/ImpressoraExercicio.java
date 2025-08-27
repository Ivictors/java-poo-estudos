package victorexercicios1.javacore.metodo.dominio;

public class ImpressoraExercicio {
    public void printer(Colaborador collaborator1) {
        System.out.println(collaborator1.name);
        System.out.println(collaborator1.age);
        System.out.println(collaborator1.salary1);
        System.out.println(collaborator1.salary2);
        System.out.println(collaborator1.salary3);
    }

    public double media(double salario1, double salario2, double salario3) {
        double soma = (salario1 +salario2+salario3)/3;
        System.out.println("a media dos salarios nos ultimos 3 meses é R$"+ soma);
        return soma;
    }
}

