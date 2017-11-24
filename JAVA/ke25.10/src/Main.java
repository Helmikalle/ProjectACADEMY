import java.sql.*;

public class Main {
    public static void main(String[] args) {
        //lataaAjuri();
        String url = "jdbc:mysql://localhost:3306/world?useSSL=false";
        try (Connection con = DriverManager.getConnection(url, "root", "!Ikkuna123")) {
            System.out.println("Yhteys saatu");
            String sql = "SELECT * FROM Country WHERE region='Nordic Countries'";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()) {
                System.out.println("---------------------------------");
                System.out.println(rs.getString("name"));
                System.out.println(rs.getString("localname"));
                System.out.println(rs.getString("population"));
                System.out.println(rs.getString("headofstate"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void lataaAjuri() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Ladattu");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
