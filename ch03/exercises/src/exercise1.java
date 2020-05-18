class Computer2 {
    // variables
    double cpuSpeed; // in GHz
    // constructor
    Computer2() {
        cpuSpeed = 0;
    }

    // methods
    void setCpuSpeed (double _cpuSpeed) {
        cpuSpeed = _cpuSpeed;
    }
    double getCpuSpeed () {
        return cpuSpeed;
    }
}

public class exercise1 {
    public static void main(String[] args) {
        Computer2 myPC = new Computer2();
        myPC.setCpuSpeed(2.5);
        System.out.println(myPC.getCpuSpeed());
    }
}
