import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {
    
        Curso curso1 = new Curso("Curso Java OO", "Curso Java Orientado a Objetos", 12);
    
        Curso curso2 = new Curso("Curso de JS", "Curso de JavaScript JS", 8);

        Mentoria mentoria = new Mentoria("Mentoria de Java OO", "Mentoria dos fundamentos de Java OO", LocalDate.now());
       
        Bootcamp bootcamp = new Bootcamp("Bootcamp Java Developer", "Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devEdson = new Dev();
        devEdson.setNome("Edson Maia");
        devEdson.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Edson:" + devEdson.getConteudosInscritos());
        devEdson.progredir();
        devEdson.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Edson:" + devEdson.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Edson:" + devEdson.getConteudosConcluidos());
        System.out.println("XP:" + devEdson.calcularTotalXp());

        System.out.println("-------");

        Dev devMaria = new Dev();
        devMaria.setNome("Maria Maia");
        devMaria.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Maria:" + devMaria.getConteudosInscritos());
        devMaria.progredir();
        devMaria.progredir();
        devMaria.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Maria:" + devMaria.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Maria:" + devMaria.getConteudosConcluidos());
        System.out.println("XP:" + devMaria.calcularTotalXp());

    }

}
