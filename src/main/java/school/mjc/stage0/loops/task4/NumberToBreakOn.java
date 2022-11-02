package school.mjc.stage0.loops.task4;

public class NumberToBreakOn {
    public static void printNumbersUntilWithBreakOn(int toBreakWith, int numberToGoUntil) {


                for (int j = 0; j <= toBreakWith; j++) {
                    if (numberToGoUntil > toBreakWith) {
                        System.out.println(j);
                    } else {
                        System.out.println("iterating till the end");

                        break;
                    }
                    System.out.println(j);

                }
                }

    public static void main(String[] args) {
        printNumbersUntilWithBreakOn(7,6);
    }
}
