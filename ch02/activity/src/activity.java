/* You are tasked with writing a program that takes a patient's blood pressure as input and then determines if 
that blood pressure is within the ideal range. Blood pressure has two components, the systolic 
blood pressure and the diastolic blood pressure. According to bloodpressureuk.org, the ideal 
systolic number is more than 90 and less than 120. 90 and below is low blood pressure. 
Above 120 and below 140 is called pre-high blood pressure, and 140 and over is high blood pressure. The ideal
diastolic blood pressure is between 60 and 80. 60 and below is low. Above 80 and under 90 is
pre-high blood pressure, and over 90 is high blood pressure. */

/* For the purpose of this activity, if either number is out of the ideal range, report that as non-ideal blood pressure:
1. Write an application that takes two numbers, the systolic blood pressure and the diastolic blood pressure.
Convert both inputs into int values. 2 Check if there is the right number of inputs at the
beginning of the program. Print an error message if any inputs are missing. Exit the
application in this case. 3. Compare against the ideal rates mentioned previously.
Output a message describing the inputs as low, ideal, pre-high, or high blood pressure.
To print an error message, use System.err.println instead of System.out.println.
4. Try out your program with a variety of inputs to ensure it works properly.
You'll need to use the Terminal pane in IntelliJ to compile and run the program with command-line
input. Look back at Exercises 15 and 16 for details on how to do this. 5. The blood pressure is
typically reported as systolic blood pressure/diastolic blood pressure. */

public class activity {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.err.println("Error. Usage is:");
            System.err.println("Activity1 systolic diastolic");
            System.exit(-1);
        }

        int systolic = Integer.parseInt(args[0]);
        int diastolic = Integer.parseInt(args[1]);

        System.out.print(systolic + "/" + diastolic + " is ");
        if ((systolic <= 90) || (diastolic <= 60)) {
            System.out.println("low blood pressure.");
        } else if ((systolic >= 140) || (diastolic >= 90)) {
            System.out.println("high blood pressure.");
        } else if ((systolic >= 120) || (diastolic >= 80)) {
            System.out.println("pre-high blood pressure.");
        } else {
            System.out.println("ideal blood pressure.");
        }
    }
}
