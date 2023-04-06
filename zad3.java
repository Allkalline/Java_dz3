import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.


public class zad3 {
    public static void main(String[] args) {
        ArrayList<Integer> lst = new ArrayList<>();
        arrayRandomizer(lst);
        System.out.println(lst);
        double avg = 0;
        for (int i = 0; i < lst.size(); i++) {
             avg += lst.get(i);
        }
        

      
        System.out.println("min: " + Collections.min(lst));
        System.out.println("max: " + Collections.max(lst));
        System.out.println("average: " + avg/lst.size());
    }
 
    

    public static void arrayRandomizer (ArrayList arr){
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            arr.add(random.nextInt(0,10));
        }
    }
}
