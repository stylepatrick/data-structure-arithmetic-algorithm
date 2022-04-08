import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(game(1000)));
    }

    private static int[] dice(int round, int[] arr) {
        if (round >= arr.length) {
            return arr;
        }
        int count = 0;
        int val = (int) (1 + Math.random() * 6);
        while (val > 1) {
            count++;
            val = (int) (1 + Math.random() * 6);
        }
        if (count == 0) {
            count++;
        }
        arr[round++] = count;
        return dice(round, arr);

    }

    private static int[] game(int n) {
        int[] arr = new int[n];
        return dice(0, arr);
    }

}
