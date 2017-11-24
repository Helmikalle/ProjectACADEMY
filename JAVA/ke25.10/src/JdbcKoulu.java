import java.sql.*;

public class JdbcKoulu {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/jdbcharjoitus?useSSL=false";
        try (Connection con = DriverManager.getConnection(url, "root", "!Ikkuna123")) {
            System.out.println("YUSH");

            // String sql3 = "insert into koulu (nimi,kaupunki) values('Märsky','Helsinki')";
            //String sql = "INSERT INTO Oppilas(etunimi, sukunimi, syntymaaika,kouluid) VALUES(?,?,?,?)";
            String sql2 = "select oppilas.etunimi,oppilas.sukunimi,oppilas.syntymaaika,koulu.nimi from oppilas join koulu on oppilas.kouluid=koulu.id";
//            //PreparedStatement lause = con.prepareStatement(sql);
//            lause.setString(1, "Niko");
//            lause.setString(2,"Helminen");
//            lause.setDate(3, Date.valueOf("2007-03-11"));
//            lause.setInt(4,1);
//            lause.executeUpdate();

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql2);
            ResultSetMetaData rsmd = rs.getMetaData();
            String sql4 = "select * from oppilas";
            String fmtstr = "%-10s | %-10s | %-10s";
            int numCols = rsmd.getColumnCount();
            
            System.out.println(rsmd.getColumnName(1));
            System.out.println(rsmd.getColumnCount());
            while (rs.next()) {
                for (int i = 1; i <= numCols; i++) {
                    if (i > 1) System.out.print("  | ");

                    System.out.print(rs.getString(i));
                }
                System.out.println();
            }
            //while (tulos.next()) {
            //  String s = rs.getString("etunimi");
            //String f = rs.getString("sukunimi");

//                String d = rs.getString("nimi");
            //System.out.println(String.format(fmtstr, s, f, d)+ " | " + rs.getDate("syntymaaika"));
            //}


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
