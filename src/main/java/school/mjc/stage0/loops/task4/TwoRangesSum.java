package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public static void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        int number = numberToSkip + lastInRow;

        for (int i = 0; i <= 1; i++) {
            if (numberToSkip > lastInRow && lastInRow > 0) {
                System.out.println("number to skip is bugger then the last");
                break;
            }
                else if  (lastInRow < 0) {
                System.out.println("last number in row is negative");
                break;
            }
                else
                System.out.println("skipped sum is number " + numberToSkip);
                System.out.println("counted sum is number " + number);

            }
        }

    public static void main(String [] arg) {
        printSumOfTwoRanges(100, 112);
    }
}
