public class Main {
    public static void main(String[] args) {

        // Static Inner class
        // Can access all static Members without Object
        OuterClassOne.StaticInnerClassOne.print();

        OuterClassOne outerClassOne = new OuterClassOne();
        System.out.println(outerClassOne.three);

        // Inner Class
        // To instantiate an inner class, we must first instantiate its outer class.
        OuterClassTwo outerClassTwo = new OuterClassTwo();

        // Generate of a new Instance of an Inner Class
        OuterClassTwo.InnerClass innerClass = outerClassTwo.new InnerClass();

        // Lokal Inner Class
        abc();

        // Anonymous Class
        // Could be replaced by lamda
        // AnonymousClass anonymousClass = x -> x;
        AnonymousClass anonymousClass = new AnonymousClass() {
            @Override
            public String abc(String x) {
                return x;
            }
        };
        System.out.println(anonymousClass.abc("one"));
        anonymousClass.test();
    }

    // Lokal Inner Class
    private static void abc() {
        class Lokal {
            final int i = 2;
            final int y = 10;

            @Override
            public String toString() {
                return "Lokal{" +
                        "i=" + i +
                        ", y=" + y +
                        '}';
            }
        }
        Lokal lokal = new Lokal();
        System.out.println(lokal);
    }
}