class Computer4 {
    public void whatIsIt() {
        System.out.println("it is a PC");
    }
}

class Tablet1 extends Computer4 {
    public void whatIsIt() {
        System.out.println("it is a tablet");
    }
}

public class exercise6 {
    public static void main(String[] args) {
        Tablet1 myTab = new Tablet1();
        myTab.whatIsIt();
    }
}
