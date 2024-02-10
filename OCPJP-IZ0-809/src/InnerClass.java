public class InnerClass {

    private int a = 5;

    Inner de = new Inner();

    public class Inner {
        public void test() {
            System.out.println("hello");
        }
    }
}
