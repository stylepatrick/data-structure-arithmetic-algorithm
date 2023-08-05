public class Arr {

    private static final int[] abc = new int[]{1, 2, 3, 4};
    private static final Objec c = Objec.abc;

    public static void print() {
        for (int i : abc) {
            System.out.println(i);
        }
    }

    public static int[] getArr() {
        return abc.clone();
    }

    public static Objec getObjec() {
        return c;
    }

}
