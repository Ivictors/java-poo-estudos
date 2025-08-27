package victorexercicios1.javacore.associacao.dominio;

public class Seminario {
    private String nome;
    private String local;
    private Alunos[] alunos;
    private ProfessorPalestrante[] professor;

    public Seminario(String nome, String local) {
        this.nome = nome;
        this.local = local;
    }

    public void imprimi() {
        System.out.println("O nome do evento é " + this.nome);
        System.out.println("O local onde o evento será realizado é " + this.local);

        if (alunos == null) {
            System.out.println("Não ha ouvintes");
        } else if (alunos != null) {
            System.out.println("\nOs alunos participantes são: ");
            for (Alunos aluno : alunos) {
                System.out.println(aluno.getNome());
            }
        }
        if (professor == null) return;
        else System.out.println("\nO nome dos professores são: ");
        for (ProfessorPalestrante palestrante : professor) {
            System.out.println(palestrante.getNome());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public Alunos[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Alunos[] alunos) {
        this.alunos = alunos;
    }

    public ProfessorPalestrante[] getProfessor() {
        return professor;
    }

    public void setProfessor(ProfessorPalestrante[] professor) {
        this.professor = professor;
    }
}
