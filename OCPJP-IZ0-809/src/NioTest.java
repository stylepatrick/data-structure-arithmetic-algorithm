import java.nio.file.Path;
import java.nio.file.Paths;

public class NioTest {

    public static void main(String[] args) {
        Path p = Paths.get("/test/test2");
        System.out.println(p.getNameCount());
        System.out.println(p.getName(0));
        System.out.println(p.getName(1));
        System.out.println(p.getName(2));
    }
}
