import java.util.Arrays;
import java.util.Comparator;

public class lambdaTest {

    public static void main(String[] string){
        String [] array= { "Apple", "Orange", "Banana", "Lemon" };

        Arrays.sort(array,new Comparator<String>(){
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        Arrays.sort(array, (o1, o2) -> o1.compareTo(o2));
        Arrays.sort(array, String::compareTo);

        System.out.println(String.join(", ", array));
    }
}




