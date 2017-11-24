package fi.academy;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Administrator on 2.11.2017.
 */
@WebServlet(name = "IstuntoNimiServlet", urlPatterns = "/IstuntoNimiServlet")
public class IstuntoNimiServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        try (PrintWriter out = response.getWriter()) {
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Hei maailma -servlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<form action='TervehdysServlet' method='POST'>");
            out.println("ANNA NIMI: <input type='text' name='nimi'>");
            out.println("<input type='submit' name='TervehdysServlet'>");
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}


