class Computer3 {
    // variables
    private double cpuSpeed;
    // constructor
    Computer3() {
        cpuSpeed = 0;
    }
    // methods
    void setCpuSpeed (double _cpuSpeed) {
        cpuSpeed = 0;
    }

    double getCpuSpeed() {
        return cpuSpeed;
    }
}

public class exercise2 {
    public static void main(String[] args) {
        Computer3 myPC = new Computer3();
        myPC.setCpuSpeed(2.5);
        System.out.println(myPC.getCpuSpeed());
    }
}
