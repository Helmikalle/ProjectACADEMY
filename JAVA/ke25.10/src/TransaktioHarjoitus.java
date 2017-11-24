import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class TransaktioHarjoitus {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/jdbcharjoitus?useSSL=false";
        try (Connection con = DriverManager.getConnection(url,"root","!Ikkuna123")) {
            Scanner sc = new Scanner(System.in);
            PreparedStatement stmt;
            con.setAutoCommit(false);
            stmt = con.prepareStatement("UPDATE Oppilas SET sukunimi='XXX' WHERE id=1");
            stmt.executeUpdate();
            System.out.println("HEP");
            sc.nextLine();
            con.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
