import java.io.IOException;

public class AutoClosableOne implements AutoCloseable {


    @Override
    public void close() throws IOException {
        System.out.println("close");
        //throw new IOException();
    }
}
