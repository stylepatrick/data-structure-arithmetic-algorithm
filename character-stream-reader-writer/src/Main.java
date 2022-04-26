import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arrayList = fileReader();
        fileWriterWithPattern(arrayList, "ein");
    }

    private static ArrayList<String> fileReader() {
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            FileReader reader = new FileReader("input.txt");
            int ch = reader.read();
            while (ch >= 0) {
                StringBuilder stringBuilder = new StringBuilder();
                while (ch >= 0 && ch != '\r') {
                    stringBuilder.append((char) ch);
                    ch = reader.read();
                }
                arrayList.add(stringBuilder.toString());
                if (ch == '\r') {
                    ch = reader.read(); // skip CR
                    ch = reader.read(); // skip LF
                }
            }
            reader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Arrays.toString(arrayList.toArray()));
        return arrayList;
    }

    private static void fileWriterWithPattern(ArrayList<String> arrayList, String pattern) {
        try {
            FileWriter fileWriter = new FileWriter("output1.txt");
            arrayList.forEach(row -> {
                if (row.contains(pattern)) {
                    try {
                        fileWriter.write(row);
                        fileWriter.write("\n");
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
            });
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            PrintStream printStream = new PrintStream("output.txt");
            arrayList.forEach(row -> {
                if (row.contains(pattern)) {
                    printStream.println(row);
                }
            });
            printStream.flush();
            printStream.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}