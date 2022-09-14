import java.util.ArrayList;

public class GenericsDemo6 {
        public static void main(String[] args) throws Exception {

            ArrayList<Integer> list = new ArrayList<Integer>();

            list.add(1);  //这样调用 add 方法只能存储整形，因为泛型类型的实例为 Integer

            list.getClass().getMethod("add", Object.class).invoke(list, "asd");
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));
            }
        }

}



