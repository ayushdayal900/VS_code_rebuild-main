package ARRAYS;

public class ArrayPairs {

    public static void makePairs(int aray[]) {

        for (int i = 0; i < aray.length; i++) {
            for (int j = i + 1; j < aray.length; j++) {
                System.out.print("(" + aray[i] + "," + aray[j] + ") ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int aray[] = { 1, 2, 3, 4, 5 };
        makePairs(aray);

    }
}
