
package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {

              public static void main(String[] args) {

                            Curso curso1 = new Curso();
                            curso1.setTitulo("Curso de Java");
                            curso1.setDescricao("Descrição do Curso de Java");
                            curso1.setCargaHoraria(8);

                            Curso curso2 = new Curso();
                            curso2.setTitulo("Curso deJava Script");
                            curso2.setDescricao("Descrição do Curso de Java Script");
                            curso2.setCargaHoraria(4);

                            Mentoria mentoria = new Mentoria();
                            mentoria.setTitulo("Mentoria de Java");
                            mentoria.setDescricao("Descrição da Mentoria de Java");
                            mentoria.setData(LocalDate.now());

//                            System.out.println(curso1);
//                            System.out.println(curso2);
//                            System.out.println(mentoria);
                            
                            Bootcamp bootcamp = new Bootcamp();
                            bootcamp.setNome("Bootcamp java developer");
                            bootcamp.setDescricao("Descrição Bootcamp java developer");
                            bootcamp.getConteudos().add(curso1);
                            bootcamp.getConteudos().add(curso2);
                            bootcamp.getConteudos().add(mentoria);
                            
                            Dev devCamila = new Dev();
                            devCamila.setNome("Camila");
                            devCamila.InscreverBootcamp(bootcamp);
                            System.out.println("Conteudos Inscritos Camila" + devCamila.getConteudosInscritos());                            
                            devCamila.Progredir();
                            devCamila.Progredir();
                            System.out.println(".");
                            System.out.println("Conteudos Inscritos Camila" + devCamila.getConteudosInscritos());
                            System.out.println("Conteudos Concluidos Camila" + devCamila.getConteudosConcluidos());
                            System.out.println("XP" + devCamila.CalcularTotalXp());
                            
                            System.out.println("...........");
                            
                            Dev devJoao = new Dev();
                            devJoao.setNome("João");
                            devJoao.InscreverBootcamp(bootcamp);
                            System.out.println("Conteudos Inscritos João" + devJoao.getConteudosInscritos());                           
                            devJoao.Progredir();                           
                            devJoao.Progredir();                           
                            devJoao.Progredir();                           
                            System.out.println(".");
                            System.out.println("Conteudos Inscritos João" + devJoao.getConteudosInscritos());
                            System.out.println("Conteudos Concluidos João" + devJoao.getConteudosConcluidos());
                            System.out.println("XP" + devJoao.CalcularTotalXp());
              }

}
