package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        int temp = 0;
        int result;
        if (power < 0) {
            System.out.println("too much power");
        }
        while (temp <= power) {
            result = (int) Math.pow(2, temp);
            System.out.println(result);
            temp++;
        }
    }
}
