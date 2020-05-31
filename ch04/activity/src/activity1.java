import java.util.Arrays;
public class activity1 {
    public static void main(String[] args) {
        String[] text = {"So", "many", "books", "so" , "little", "time"};
        String searchQuery = "so";
        int occurrence = -1;
        for(int i = 0; i < text.length; i++) {
            occurrence = text[i].compareToIgnoreCase(searchQuery);
            if (occurrence == 0) {
                System.out.println("Found query at: " + i);
            }
        }
    }
}
