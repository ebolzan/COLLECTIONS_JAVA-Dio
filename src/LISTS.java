import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class LISTS {
    public static void main(String[] args) {
        System.out.println("Estudo de collections JAVA- utilizando jdk 18");


        int DEADLINE = 2;
        List<Integer> list = new ArrayList<>();

        list.add(4);
        list.add(6);
        list.add(1);
        list.add(9);


        //functional print
        System.out.println(list.stream().filter(number -> number > DEADLINE).reduce(0, Integer::sum));


    }
}
