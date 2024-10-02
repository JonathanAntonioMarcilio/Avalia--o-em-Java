import java.util.ArrayList;

public class Aluno {
    int idAluno;
    String nomeAluno;
    String dtNasc;
    String cpf;
    int idCurso;

    Curso curso;

    static ArrayList<Aluno> alunoList = new ArrayList<Aluno>();
    
    public Aluno(
        int idAluno,
        String nomeAluno,
        String dtNasc,
        String cpf,
        int idCurso
    ){
        this.idAluno = idAluno;
        this.nomeAluno = nomeAluno;
        this.dtNasc = dtNasc;
        this.cpf = cpf;
        this.idCurso = idCurso;

        alunoList.add(this);
    }











}
