package PlataformaDeEnsino.Program;

import PlataformaDeEnsino.entities.Lesson;
import PlataformaDeEnsino.entities.Task;
import PlataformaDeEnsino.entities.Video;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Lesson> list = new ArrayList<>();

        System.out.print("Quantas aulas tem o curso? ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            System.out.println("Dados da " + i + " aula:");
            System.out.print("Conteúdo ou tarefa (c/t)? ");
            char ch = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Título: ");
            String title = sc.nextLine();

            if(ch == 'c') {
                System.out.print("URL do vídeo: ");
                String url = sc.nextLine();
                System.out.print("Duração em segundos: ");
                int duration = sc.nextInt();

                list.add( new Video(title, url, duration) );

            } else {
                System.out.print("Descrição: ");
                String description = sc.nextLine();
                System.out.print("Quantidade de questões: ");
                int questionCount = sc.nextInt();

                list.add( new Task(title, description, questionCount) );

            }

        }

        System.out.println();

        double sum = 0.0;

        for(Lesson lesson : list) {
            sum += lesson.duration();
        }

        System.out.printf("DURAÇÃO TOTAL DO CURSO = %.1f segundos", sum);


        sc.close();
    }
}