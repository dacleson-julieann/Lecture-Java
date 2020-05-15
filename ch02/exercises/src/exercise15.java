/* testing command-line arguments
* command-line arguments are parameters passed to the main() method of your java program.
* prove their usefulness by giving you one way of providing inputs to your program.*/

public class exercise15 {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println(i + " " + args[i]);
        }
    }
}
