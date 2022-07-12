package EightK;

/*
Bob pracuje jako kierowca autobusu.
Stał się jednak niezwykle popularny wśród mieszkańców miasta. Przy tak dużej liczbie pasażerów, którzy chcą wsiąść
do jego autobusu, czasami musi zmierzyć się z problemem braku miejsca w autobusie! Chce, żebyś napisał prosty
program mówiący mu, czy będzie w stanie zmieścić wszystkich pasażerów.
Przegląd zadań:
Musisz napisać funkcję, która akceptuje trzy parametry:

cap to liczba osób, które autobus może pomieścić bez kierowcy.
to liczba osób w autobusie bez kierowcy.
czekaj to liczba osób oczekujących na wejście do autobusu, z wyłączeniem kierowcy.
Jeśli jest wystarczająco dużo miejsca, zwróć 0, a jeśli nie, zwróć liczbę pasażerów, których nie może zabrać.
*/
public class Task4 {
    public static void main(String[] args) {
        int cap = 56;
        int on = 26;
        int wait = 32;
        int difference= cap-on;
        if (difference>=wait){
            System.out.println(0);
        }else System.out.println(wait-difference);
    }

}
