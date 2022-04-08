import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[][] lotto = new int[3][6];
        lotto[0][0] = 3;
        lotto[0][1] = 5;
        lotto[0][2] = 7;
        lotto[0][3] = 12;
        lotto[0][4] = 17;
        lotto[0][5] = 23;

        lotto[1][0] = 3;
        lotto[1][1] = 7;
        lotto[1][2] = 12;
        lotto[1][3] = 17;
        lotto[1][4] = 26;
        lotto[1][5] = 35;

        lotto[2][0] = 9;
        lotto[2][1] = 12;
        lotto[2][2] = 19;
        lotto[2][3] = 23;
        lotto[2][4] = 25;
        lotto[2][5] = 31;

        check(lotto);
    }

    private static void check(int[][] lotto) {
        int[] points = new int[lotto.length - 1];
        int[] winner = lotto[0];
        for (int i = 1; i < lotto.length; i++) {
            for (int n = 0; n < lotto[i].length; n++) {
                for (int m = 0; m < lotto[i].length; m++) {
                    if (winner[n] == lotto[i][m]) {
                        points[i - 1] = points[i - 1] + 1;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(points));
    }
}
