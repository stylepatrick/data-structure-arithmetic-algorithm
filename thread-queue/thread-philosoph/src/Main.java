public class Main {

    public static void main(String[] args) {

        Fork fork = new Fork();

        Philosoph p1 = new Philosoph(0, 280, 30, fork);
        Philosoph p2 = new Philosoph(1, 80, 50, fork);
        Philosoph p3 = new Philosoph(2, 455, 60, fork);
        Philosoph p4 = new Philosoph(3, 99, 30, fork);
        Philosoph p5 = new Philosoph(4, 480, 70, fork);

        p1.start();
        p2.start();
        p3.start();
        p4.start();
        p5.start();
    }
}
