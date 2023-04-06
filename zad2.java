import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

//Пусть дан произвольный список целых чисел, удалить из него чётные числа


public class zad2 {
    public static void main(String[] args) {
        ArrayList<Integer> lst = new ArrayList<>();
        arrayRandomizer(lst);
        System.out.println(lst);
        Iterator<Integer> iterator = lst.iterator();
        while (iterator.hasNext()) {
            if (iterator.next()%2 == 0){
                iterator.remove();
            }
        }
        System.out.println(lst);
    }

 
    public static void arrayRandomizer (ArrayList arr){
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            arr.add(random.nextInt(0,10));
        }
    }
}
