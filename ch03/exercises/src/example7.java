class Computer5 {
    public static void whatIsIt() {
        System.out.println("it is a PC");
    }
}
class Tablet2 extends Computer {
    public static void whatIsIt() {
        System.out.println("it is a tablet");
    }
}
public class example7 {
    public static void main(String[] args) {
        Computer5 myTab = new Computer5();
        myTab.whatIsIt();
    }
}
