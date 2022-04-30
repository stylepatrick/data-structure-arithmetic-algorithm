import java.io.*;
import java.util.TreeSet;

public class Main {
    private static void writeToDataOutputStream() {
        try {
            String text = "5 6 1 ! 2 3 \n 1 9 2 1d & d 3";
            FileOutputStream fs = new FileOutputStream("output.txt");
            DataOutputStream s = new DataOutputStream(fs);
            s.writeBytes(text);
            s.flush();
            s.close();
        } catch (FileNotFoundException e) {
            System.out.println("-- could not open file");
        } catch (IOException e) {
            System.out.println("-- error writing file");
        }
    }

    private static void readFromDataInputStream() {
        // TreeSet used to have ordered list + elements unique
        TreeSet<Integer> treeSet = new TreeSet<>();
        try {
            DataInputStream s = new DataInputStream(new FileInputStream("output.txt"));
            try {
                while (s.available() > 0) {
                    int x = s.readByte();
                    // Filter all not numeric values between 0 - 9
                    if (Character.getNumericValue(x) >= 0 && Character.getNumericValue(x) <= 9) {
                        treeSet.add(Character.getNumericValue(x));
                    }
                }
                FileOutputStream st = new FileOutputStream("filtered.txt");
                DataOutputStream ft = new DataOutputStream(st);
                for (Integer i : treeSet) {
                    ft.writeBytes(i.toString() + "\n");
                }
                ft.flush();
                ft.close();
            } catch (EOFException e) {
                s.close();
            }
        } catch (FileNotFoundException e) {
            System.out.println("-- could not open file");
        } catch (IOException e) {
            System.out.println("-- error reading file");
        }
    }

    public static void main(String[] arg) {
        writeToDataOutputStream();
        readFromDataInputStream();
    }
}
