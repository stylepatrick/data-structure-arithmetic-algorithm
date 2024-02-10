import java.io.*;

public class IOTestExample {

    public static void main(String[] args) {
        File file = new File("C:\\temp\\test.txt");
        File file2 = new File("C:\\temp\\test2.txt");
        System.out.println(file.isFile());

        try (BufferedOutputStream buffer = new BufferedOutputStream(new FileOutputStream(file2));
             BufferedInputStream bufferedReader = new BufferedInputStream(new FileInputStream(file))) {
            buffer.write('t');
            buffer.flush();
            byte[] chars = new byte[10];
            while ((bufferedReader.read(chars)) > 0) {
                buffer.write(chars, 0, chars.length);
            }
        } catch (IOException ignored) {
        }
    }

}
