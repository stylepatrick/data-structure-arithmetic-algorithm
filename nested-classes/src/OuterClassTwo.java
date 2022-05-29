public class OuterClassTwo {

    int a = 8;

    // Has access to all Member from the outer class
    // Should be used if access to the outer member fields is required
    public class InnerClass {

        int b = 10;
        int c = a + 1;

    }
}
