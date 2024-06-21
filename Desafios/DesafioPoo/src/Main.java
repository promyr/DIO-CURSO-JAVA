import Dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso de Java");
        curso1.setDescricao("Java básico para iniciantes");
        curso1.setCargaHoraria(40);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso de Java");
        curso2.setDescricao("html básico para iniciantes");
        curso2.setCargaHoraria(20);

        Conteudo conteudo = new Conteudo() {
            @Override
            public double calcularXp() {
                return 0;
            }
        };

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("descricao Mentoria de Java");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Desenvolvedor");
        bootcamp.setDescricao("Bootcamp Java Desenvolvedor para iniciantes");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devPromyr = new Dev();
        devPromyr.setNome("Promyr");
        devPromyr.inscreverBootcamp(bootcamp);

        System.out.println("Conteudos inscritos de promyr: " + devPromyr.getConteudosInscrito());
        devPromyr.progredir();
        System.out.println("-");
        devPromyr.progredir();
        devPromyr.progredir();
        System.out.println("Conteudos inscritos de promyr: " + devPromyr.getConteudosInscrito());
        System.out.println("Conteudos concluidos de promyr: " + devPromyr.getConteudosConcluidos());
        System.out.println("XP: " + devPromyr.calcularXp());

        System.out.println("----------------------");

        Dev devPedro = new Dev();
        devPedro.setNome("Pedro");
        devPedro.inscreverBootcamp(bootcamp);

        System.out.println("Conteudos inscritos de pedro: " + devPedro.getConteudosInscrito());
        devPedro.progredir();
        System.out.println("-");
        System.out.println("Conteudos inscritos de pedro: " + devPedro.getConteudosInscrito());
        System.out.println("Conteudos concluidos de pedro: " + devPedro.getConteudosConcluidos());
        System.out.println("XP: " + devPedro.calcularXp());

        System.out.println("----------------------");




    }
}
