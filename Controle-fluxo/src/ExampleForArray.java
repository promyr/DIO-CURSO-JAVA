public class ExampleForArray {

    public static void main(String[] args) {

        // em arrays o indice inicia em ZERO
        String alunos[] = {"FELIPE", "JONAS", "JULIA", "MARCOS"};

        for(String aluno : alunos){
            System.out.println("nome do aluno é " + aluno);
        }
    }
}
