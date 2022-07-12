package EightK;

import java.util.Scanner;

/*Timmy i Sarah myślą, że są zakochani, ale w okolicy,
    w której mieszkają, poznają je dopiero,
    gdy każdy z nich zbierze kwiat.
    Jeśli jeden z kwiatów ma parzystą liczbę płatków,
    a drugi nieparzystą, oznacza to, że są zakochani.

    Napisz funkcję, która pobierze liczbę płatków
    każdego kwiatka i zwróci prawdę, jeśli są zakochani,
    i fałsz, jeśli nie są.*/
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Podaj liczbę płatków kwiatka nr 1: ");
        int firstPetal = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Podaj liczbę płatków kwiatka nr 2: ");
        int secondPetal = scanner.nextInt();
        scanner.nextLine();
        if ((firstPetal + secondPetal) %2==0 ){
            System.out.println("Nie sa w sobie zakochani!!");
        }else System.out.println("Są w sobie zakochani!!");

    }

}
