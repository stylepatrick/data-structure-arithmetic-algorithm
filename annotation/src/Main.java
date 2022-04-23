import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

@Comment(author = "Patrick", comment = "Test")
public class Main {

    public static void main(String[] args) {
        Class c = Main.class;
        if (c.isAnnotationPresent(Comment.class)) {
            Comment v = (Comment) c.getAnnotation(Comment.class);
            System.out.println(v.author());
            System.out.println(v.comment());
        }
        System.out.println("--------");

        Method[] methods = c.getMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(Entry.class)) {
                System.out.println(method.getName());
                System.out.println(Arrays.toString(method.getParameterTypes()));
                System.out.println(method.getReturnType());
                System.out.println(Modifier.isPublic(method.getModifiers()));
                System.out.println(Modifier.isStatic(method.getModifiers()));
                System.out.println(Arrays.toString(method.getExceptionTypes()));
            }
        }

    }

    @Entry
    public static void test() {

    }

    @Entry
    public static int param(int a, String b) throws NullPointerException {
        return -1;
    }
}