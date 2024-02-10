public class FourLegged {
    String walk = "walk,";
    public void walk() {
        System.out.print(walk);
    }
    static class BabyRhino extends FourLegged {
        public void walk() {
            System.out.print(walk);
        }
        String walk = "toddle,";
    }
    public static void main(String[] args) {
        FourLegged f = new BabyRhino();
        BabyRhino b = new BabyRhino();
        f.walk();
        b.walk();
    } }