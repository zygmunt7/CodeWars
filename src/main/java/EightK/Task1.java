package EightK;

public class Task1 {

    //Napisz funkcję, która pobiera tablicę liczb i
    // zwraca sumę liczb. Liczby mogą być ujemne lub niecałkowite.
    // Jeśli tablica nie zawiera żadnych liczb, należy zwrócić 0.

    public static void main(String[] args) {

        double [] array = {-2.398};
        double sum = 0;

        for (int i=0; i<array.length;i++){
            sum += array[i];
        }
        if (array.length <=0){
            System.out.println(0);
        }else System.out.println(sum);

    }

}
