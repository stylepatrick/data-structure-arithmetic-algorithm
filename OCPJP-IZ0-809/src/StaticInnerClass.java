public class StaticInnerClass {

    private int a = 5;

    Inner de = new Inner();

    public static class Inner {
        public void test() {
            System.out.println("hello");
        }
    }
}
