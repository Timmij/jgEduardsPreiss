package lv.homework6;

public class NumberService {


    private int startRange;
    private int endRange;

    public NumberService(int startRange, int endRange) {
        this.startRange = startRange;
        this.endRange = endRange;
    }

    public void sumInRange() {
        if (startRange > endRange) {
            for (int i = endRange; i <= startRange; i++) {
                System.out.print(i);
            }
            System.out.println();
        } else {
            int num = endRange, sum = 0;
            for (int i = startRange; i <= endRange; i++) {
                sum += i;
            }
            System.out.println("Sum for number in range from " + startRange + " till " + endRange + " = " + sum);

        }
    }

    public void getEvenNumberCount() {
        int evenNR = 0;
        if (startRange < endRange) {
            for (int i = startRange; i <= endRange; i++) {
                if (i % 2 == 0) {
                    evenNR++;
                }
            }
            System.out.println("Even Number count in range from "
                    + startRange + " to "
                    + endRange + " is " + evenNR);
        } else if (startRange > endRange) {
            for (int i = endRange; i <= startRange; i++) {
                if (i % 2 == 0) {
                    evenNR++;
                }
            }
            System.out.println("Even Number count in range from "
                    + startRange + " to "
                    + endRange + " is " + evenNR);
        }
    }
}


