import java.util.Arrays;
import java.util.Comparator;

public class enumTest {

    public static void main(String[] string){
        QuartzToolTypeTest type = QuartzToolTypeTest.CERTUS;
        System.out.println(type);
        String [] array= {"a","b","c"};

        Arrays.sort(array,new Comparator<String>(){
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
    }
}

enum QuartzToolTypeTest {
    CERTUS
}



