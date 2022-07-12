package EightK;

public class Task1 {

    //Napisz funkcję, która pobiera tablicę liczb i
    // zwraca sumę liczb. Liczby mogą być ujemne lub niecałkowite.
    // Jeśli tablica nie zawiera żadnych liczb, należy zwrócić 0.

    public static void main(String[] args) {

        double []  numbers = {-2.398};
        System.out.println(sumArray(numbers));


        /*for (int i=0; i<numbers.length;i++){
            sum += numbers[i];
        }
        if (numbers.length <=0){
            System.out.println(0);
        }else System.out.println(sum);*/

    }
    public static double sumArray(double[] numbers){


        double sum = 0;
        for (int i=0; i<numbers.length;i++){
            sum += numbers[i];
        }
        if (numbers.length <=0){
            return 0;
        }else System.out.println(sum);
        return 0;

    }
}
