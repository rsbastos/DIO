import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição do curso Java");
        curso1.setCargaHoraria(80);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição do curso JS");
        curso2.setCargaHoraria(40);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria em Java");
        mentoria.setDescricao("Descrição da Mentoria em Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição do Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devJoaquim = new Dev();
        devJoaquim.setNome("Joaquim");
        devJoaquim.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Joaquim: " + devJoaquim.getConteudosInscritos());

        devJoaquim.progredir();
        System.out.println(" - - - - -");
        System.out.println("Conteúdos inscritos Joaquim: " + devJoaquim.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Joaquim: " + devJoaquim.getConteudosConcluidos());
        System.out.println("XP: " + devJoaquim.calcularTotalXp());

        Dev devMaria = new Dev();
        devMaria.setNome("Maria");
        devMaria.inscreverBootcamp(bootcamp);
        System.out.println("\nConteúdos inscritos Maria: " + devMaria.getConteudosInscritos());

        devMaria.progredir();
        devMaria.progredir();
        System.out.println(" - - - - -");
        System.out.println("Conteúdos inscritos Maria: " + devMaria.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Maria: " + devMaria.getConteudosConcluidos());
        System.out.println("XP: " + devMaria.calcularTotalXp());
    }
}
