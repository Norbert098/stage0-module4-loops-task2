package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {

        int i=0, s=1;
        while(i <= printToInclusive){
            if (i <= 1) {
                System.out.println(1);
            } else {
                s *= i;
                System.out.println(s);
            }
            i++;
        }
    }

    public static void main(String[] args) {
        FactorialNumbers factorialNumbers = new FactorialNumbers();
        factorialNumbers.printFactorialRow(8);
    }
}
