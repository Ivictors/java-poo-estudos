package victorexercicios1.javacore.associacao.teste;

import victorexercicios1.javacore.associacao.dominio.Alunos;
import victorexercicios1.javacore.associacao.dominio.ProfessorPalestrante;
import victorexercicios1.javacore.associacao.dominio.Seminario;

public class SeminarioTeste {
    public static void main(String[] args) {
        Seminario seminario = new Seminario("Exame Chunnin", "Konoha");

        ProfessorPalestrante professor1 = new ProfessorPalestrante("Gay sensei", "Tai - jutsu");
        ProfessorPalestrante professor2 = new ProfessorPalestrante("Kakashi sensei", "Ninjutsu");
        ProfessorPalestrante[] professores = {professor1, professor2};

        Alunos aluno1 = new Alunos("Naruto", 12, seminario);
        Alunos aluno2 = new Alunos("Sasuke", 12, seminario);
        Alunos aluno3 = new Alunos("Sakura", 12, seminario);
        Alunos[] alunos = {aluno1, aluno2, aluno3};

        seminario.setAlunos(alunos);
        seminario.setProfessor(professores);
        seminario.imprimi();
    }
}
