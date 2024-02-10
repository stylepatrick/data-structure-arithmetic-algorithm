import java.io.IOException;
import java.util.ArrayList;

public class MyResourceTest {
        public static void main(String[] args) {
            try(MyResource resource = new MyResource()) {
                resource.execute();
            } catch (Exception e) {
                
            }

            ArrayList rawList = new ArrayList();

            rawList.add("Hello");
            rawList.add(42);

            for (Object item : rawList) {
                if (item instanceof String) {
                    System.out.print("String ");
                } else if (item instanceof Integer) {
                    System.out.print("Integer ");
                }
            }
        }
}
