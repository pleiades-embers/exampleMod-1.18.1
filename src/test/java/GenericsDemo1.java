import java.util.*;

public class GenericsDemo1 {
    private static <E extends Comparable<? super E>> E max(List<? extends E> e1) {
        if (e1 == null) {
            return null;
        }
        //迭代器对象 提供一种方法顺序访问一个聚合对象中的各个元素,而又不暴露其内部的表示
        Iterator<? extends E> iterator = e1.iterator();
        E result = iterator.next();
        while (iterator.hasNext()) {
            E next = iterator.next();
            if (next.compareTo(result) > 0) {
                result = next;
            }
        }
        return result;
    }


    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 4, 5, 888, 7, 8);
        System.out.println(max(integers));
    }
}




// 如下funD方法会报错
//public static void funC(List<A> listA){
//        // ...
//        }
//public static void funD(List<B> listB){
//        funC(listB); // Unresolved compilation problem: The method doPrint(List<A>) in the type test is not applicable for the arguments (List<B>)
//        // ...
//        }



