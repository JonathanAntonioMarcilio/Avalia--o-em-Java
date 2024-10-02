import java.util.ArrayList;

public class Professor {
    int idProf;
    String nomeProf;
    String departamento;

    static ArrayList<Professor> professorList = new ArrayList<Professor>(); 

    public Professor(
        int idProf,
        String nomeProf,
        String departamento
    ){
        this.idProf = idProf;
        this.nomeProf = nomeProf;
        this.departamento = departamento;

        professorList.add(this);
    }

    static void verificaId(int idProf) throws Exception {
        for (Professor professor : professorList) {
            if (professor.idProf == idProf) {
                return;
            }
        }
        throw new Exception("Tutor não encontrado");
    }

    static Professor buscaProfessor(int idProf) {
        for (Professor professor : professorList) {
            if (professor.idProf == idProf) {
                return professor;
            }
        }
        return null;
    }










}
