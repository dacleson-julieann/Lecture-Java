import java.util.*;
public class exercise5 {
    public static void main(String[] args) {
        Integer[] myArray = new Integer[] {3, 23, 2, 79, 2};
        Set mySet = new HashSet(Arrays.asList(myArray));
        System.out.println(mySet);
    }
}
