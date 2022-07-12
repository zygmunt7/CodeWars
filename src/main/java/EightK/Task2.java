package EightK;

/*
        Napisz funkcję, która pobiera tablicę słów,
        łączy je w zdanie i zwraca to zdanie.
        Możesz zignorować potrzebę oczyszczenia słów
        lub dodania interpunkcji, ale powinieneś dodać spacje
        między każdym słowem.
        Uważaj, nie powinno być spacji na początku ani na końcu zdania!
*/
public class Task2 {
    public static void main(String[] args) {
        String[] array = {"hello", "world", "this", "is", "great"};
        System.out.println(arrayOfString(array));

    }

    public static String arrayOfString (String[] array){

        System.out.println(array[0]+" "+array[1]+" "+array[2]+" "+array[3]+" "+array[4]);
        return null;
    }
}
