public class Main {

    public static void main(String[] args) {
        int height = 5;
        move(height, height);
    }

    private static void move(int actualHeight, int startHeight) {
        actualHeight = actualHeight - 1;
        if (actualHeight == 0) {
            System.out.println(actualHeight + ": " + 0 + " -> " + 1);
            move(actualHeight, startHeight);
        } else if (actualHeight < 0) {
            if (Math.abs(actualHeight) > startHeight - 1) {
                return;
            }
            System.out.println(Math.abs(actualHeight) + ": " + 2 + " -> " + 1);
            move(actualHeight, startHeight);
        } else {
            System.out.println(actualHeight + ": " + 0 + " -> " + 2);
            move(actualHeight, startHeight);
        }

    }

}
