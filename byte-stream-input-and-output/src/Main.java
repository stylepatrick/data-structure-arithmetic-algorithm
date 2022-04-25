import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        final int BLOCKSIZE = 16;

        ArrayList<byte[]> bytes = new ArrayList<>();

        try {
            InputStream inputStream = new FileInputStream("input.txt");
            while (inputStream.available() > BLOCKSIZE) {
                byte[] block = new byte[BLOCKSIZE];
                inputStream.read(block, 0, BLOCKSIZE);
                bytes.add(block);
            }

            // stream reduces on every read -> available() will be reduced
            byte[] block = new byte[inputStream.available()];
            inputStream.read(block, 0, inputStream.available());
            bytes.add(block);

            OutputStream outputStream = new FileOutputStream("output.txt");
            bytes.forEach(bl -> {
                StringBuilder stringBuilder = new StringBuilder();
                StringBuilder stringBuilderHex = new StringBuilder();
                for (byte b : bl) {
                    stringBuilder.append((char) b);
                    try {
                        outputStream.write(b);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    stringBuilderHex.append(String.format("%02X ", b));
                }
                System.out.println(stringBuilder);
                System.out.println(stringBuilderHex);
            });
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}