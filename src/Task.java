import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Task{
    String str;
    public static void main(String[] args){

        String str = "Так говорила в июле 1805 года известная Анна Павловна Шерер, фрейлина и приближенная императрицы " +
                "Марии Феодоровны, встречая важного и чиновного князя Василия, первого приехавшего на ее вечер. " +
                "Анна Павловна кашляла несколько дней, у нее был грипп, как она говорила (грипп был тогда новое слово, " +
                "употреблявшееся только редкими). В записочках, разосланных утром с красным лакеем, " +
                "было написано без различия во всех:“";
        ArrayList list = new ArrayList<>();


        IntStream intStream = IntStream.range(-5001,5001);
        intStream.filter(w -> w % 2 == 0).filter(w -> w > 0).forEach(list ::add);
        System.out.println(list);



        System.out.println(split(str));



    }
    public static List split (String str) {
        return Stream.of(str.split(" "))
                .map (elem -> new String(elem))
                .collect(Collectors.toList());
    }


}