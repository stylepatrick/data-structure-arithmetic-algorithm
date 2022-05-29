public class OuterClassOne {

    private static int one = 5;
    public int three = StaticInnerClassOne.two;

    // Can access all static fields from outer class also private Members.
    // Non-static Members are not visible
    public static class StaticInnerClassOne{

        private static int two = one + 10;

        public static void print() {
            System.out.println(two);
        }

    }
}
