import java.sql.*;

public class Hakuja {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/world?useSSL=false";
        try {
            Connection con = DriverManager.getConnection(url,"root","!Ikkuna123");
            String sql = "select country.name, countrylanguage.countrycode, countrylanguage.isofficial, country.population, country.surfacearea from countrylanguage"+
                    " join country on countrylanguage.countrycode=country.code where language = 'English'";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            String fmtstr = "%-20s | %10.1f | %10d | %5.2f";
            while (rs.next()){
                String s = rs.getString("name");
                float f = rs.getFloat("SurfaceArea");
                int i = rs.getInt("Population");
                double d = (i/f);
                System.out.println(String.format(fmtstr, s, f, i, d));
            }con.close();
           /** while (rs.next()){
                System.out.print(rs.getString(1)+"|");
                System.out.print(rs.getString(2)+ "|");
                System.out.println(rs.getString(3));
                System.out.println("----------------------");

            }**/
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
