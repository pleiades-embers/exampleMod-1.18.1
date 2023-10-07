import java.util.ArrayList;

public class GenericsDemo5 {
        public static void main(String[] args) {

            ArrayList<String> list1 = new ArrayList<String>();
            list1.add("abc");

            ArrayList<Integer> list2 = new ArrayList<Integer>();
            list2.add(123);

            System.out.println(list1.getClass() == list2.getClass()); // true
        }
}
