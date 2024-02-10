import java.io.Closeable;
import java.io.IOException;

class MyResource implements Closeable {
    public void execute() {
        System.out.println("Executing");
    }

    @Override
    public void close() {

    }
}

