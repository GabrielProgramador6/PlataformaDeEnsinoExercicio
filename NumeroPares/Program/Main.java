package NumeroPares.Program;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();

        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            int x = sc.nextInt();

            if(x % 2 == 0) {
                list.add(x);
            }
        }

        System.out.println("NUMEROS PARES: ");
        for(int obj : list) {
            System.out.print(obj + " ");
        }

        System.out.println();

        System.out.print("QUANTIDADE DE PARES = " + list.size());


        sc.close();

    }
}
