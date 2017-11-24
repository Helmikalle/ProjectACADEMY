package fi.academy;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


@WebServlet(name = "HelloDBMaailmaServlet", urlPatterns = "/HelloDBMaailmaServlet")
public class HelloDBMaailmaServlet extends HttpServlet {
    @Resource(name = "jdbc/MaailmaDB")
    DataSource ds;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);

    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        StringBuilder sb = new StringBuilder();
        String haku = request.getParameter("maa");
        try (Connection con = ds.getConnection()) {
            String sql = "SELECT * from foorumi where name like ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, haku+"%");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                sb.append(rs.getString(2)).append("</br>");
                sb.append(rs.getString(3)).append("</br>");

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try (PrintWriter out = response.getWriter()) {
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Hei maailma -servlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<form method='POST'>");
            out.println("<input type='text' name='maa'>");
            out.println("<input type='submit' name='hae'");
            out.println("</form>");
            out.println("<p>Maita </p>");
            out.println(sb);
            out.println("</body>");
            out.println("</html>");
        }
    }
}
