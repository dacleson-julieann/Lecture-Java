import java.util.*;
import java.io.Console;
public class test1 {
    public static void main(String[] args) {
        ArrayList <String> text = new ArrayList<String>();
        Console cons;
        String line = "";
        if ((cons = System.console()) != null && (line = cons.readLine()) != null) {
            text.add(line);

        }
        System.out.println("You typed: " + text);
    }
}
