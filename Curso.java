import java.util.ArrayList;

public class Curso {
    int idCurso;
    String nomeCurso;
    int cargaHora;
    int idProf;

    Professor professor;

    static ArrayList<Curso> cursoList = new ArrayList<Curso>();

    public Curso(
        int idCurso,
        String nomeCurso,
        int cargaHora,
        int idProf
    ){
        this.idCurso = idCurso;
        this.nomeCurso = nomeCurso;
        this.cargaHora = cargaHora;
        this.idProf = idProf;

        cursoList.add(this);
    }

    static void verificaId(int idCurso) throws Exception {
        for (Curso curso : cursoList) {
            if (curso.idCurso == idCurso) {
                return;
            }
        }
        throw new Exception("Tutor não encontrado");
    }

    static Curso buscaCurso(int idCurso) {
        for (Curso curso : cursoList) {
            if (curso.idCurso == idCurso) {
                return curso;
            }
        }
        return null;
    }









}
