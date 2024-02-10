import java.io.IOException;
import java.sql.SQLDataException;
import java.sql.SQLException;

public class ExceptionsTest {

    public static void main(String[] args) {


        try {
            int a = 5;
            test();
        } catch (SQLDataException | IOException e) {
            System.out.println("e");
        } catch (SQLException e) {
            System.out.println("dk");
        }
        finally {
            System.out.println("finish");
        }

        try (AutoClosableOne one = new AutoClosableOne(); AutoClosableOne two = new AutoClosableOne()) {
            throw new RuntimeException();
        } catch (IOException e) {
            System.out.println("e");
        } finally {
            System.out.println("finish");
        }


    }

    public static void test() throws SQLException, SQLDataException, IOException {
        System.out.println("fa");
    }

}
