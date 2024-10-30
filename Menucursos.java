import java.util.Scanner;

public class Menucursos {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);

        int op = 0, idProf, idCurso, cargaHora, idAluno;
        String nomeProf, departamento, nomeCurso, nomeAluno, dtNasc, cpf;

        do{
            System.out.println("[1] Cadastrar Professor");
            System.out.println("[2] Cadastrar Curso");
            System.out.println("[3] Cadastrar Aluno");
            System.out.println("[4] Listar Professores");
            System.out.println("[5] Listar Cursos");
            System.out.println("[6] Listar Alunos");
            System.out.println("[7] Sair");
            op = scanner.nextInt();
            switch(op){ 
                case 1: // Cadastrar Professor
                    System.out.println("Cadastrar Professor");
                    System.out.println("Digite o id do professor: ");
                    idProf = scanner.nextInt();
                    System.out.println("Digite o nome do professor: ");
                    nomeProf = scanner.next();
                    System.out.println("Digite o departamento do professor: ");
                    departamento = scanner.next();
                    new Professor(idProf, nomeProf, departamento);
                    break;
                case 2: // Cadastrar Curso
                    System.out.println("Cadastrar Curso");
                    System.out.println("Digite o id do curso: ");
                    idCurso = scanner.nextInt();
                    System.out.println("Digite o nome do curso: ");
                    nomeCurso = scanner.next();
                    System.out.println("Digite a carga horária do curso: ");
                    cargaHora = scanner.nextInt();
                    System.out.println("Didite o id do professor que lecionará esse curso: ");
                    idProf = scanner.nextInt();
                    Professor.verificaId(idProf); // função para verificar se o id do professor existe
                    Professor professor = Professor.buscaProfessor(idProf); // função para ligar o id do professor com a classe do curso
                    new Curso(idCurso, nomeCurso, cargaHora, idProf);
                    break;
                case 3: // Cadastrar Aluno
                    System.out.println("Cadastrar Aluno");
                    System.out.println("Digite o id do aluno: ");
                    idAluno = scanner.nextInt();
                    System.out.println("Digite o nome do aluno: ");
                    nomeAluno = scanner.next();
                    System.out.println("Digite a data de nascimento do aluno: ");
                    dtNasc = scanner.next();
                    System.out.println("Digite o CPF do aluno: ");
                    cpf = scanner.next();
                    System.out.println("Digite o id do curso que o aluno irá cursar: ");
                    idCurso = scanner.nextInt();
                    Curso.verificaId(idCurso); // função para verificar se o id do curso existe
                    Curso curso = Curso.buscaCurso(idCurso); // função para ligar o id do curso com a classe do aluno
                    new Aluno(idAluno, nomeAluno, dtNasc, cpf, idCurso);
                    break;
                case 4: // Listar Professores
                    for(Professor professorPrint : Professor.professorList){
                        System.out.println("Nome do professor: " + professorPrint.nomeProf);
                        System.out.println("Departamento do professor: " + professorPrint.departamento);
                    }
                    break;
                case 5: // Listar Cursos
                    for(Curso cursoPrint : Curso.cursoList){
                        System.out.println("Nome do Curso: " + cursoPrint.nomeCurso);
                        System.out.println("Carga horária do Curso: " + cursoPrint.cargaHora);
                        System.out.println("Professor que está lecionado o curso: " + Professor.buscaProfessor(cursoPrint.idProf).nomeProf);
                    }
                    break;
                case 6: // Listar Alunos
                    for(Aluno alunoPrint : Aluno.alunoList){
                        System.out.println("Nome do aluno: " + alunoPrint.nomeAluno);
                        System.out.println("Data de nascimento do aluno: " + alunoPrint.dtNasc);
                        System.out.println("CPF do aluno: " + alunoPrint.cpf);
                        System.out.println("Nome do curso que o aluno está cursando: " + Curso.buscaCurso(alunoPrint.idCurso).nomeCurso);
                    }
                    break;
                case 7: // Sair do Programa
                    System.out.println("Obrigado por usar o programa :)");
                    break;
                default:
                    System.out.println("Por favor, digite uma opção válida...");
                    break;
            }
        } while(op != 7);
        scanner.close();
    }
}
