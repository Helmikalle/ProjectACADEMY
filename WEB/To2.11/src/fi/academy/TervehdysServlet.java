package fi.academy;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

/**
 * Created by Administrator on 2.11.2017.
 */
@WebServlet(name = "TervehdysServlet", urlPatterns = "/TervehdysServlet")
public class TervehdysServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String kjanimi  = request.getParameter("nimi");
        HttpSession session = request.getSession(true);
        if (kjanimi == null || "".equals(kjanimi)) {
            kjanimi = "tuntematon";
        }
        Date createTime = new Date(session.getCreationTime());
        Date lastAccessTime = new Date(session.getLastAccessedTime());
        session.setAttribute("nimi",kjanimi);
        try (PrintWriter out = response.getWriter()) {
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Hei maailma -servlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Hei, " + kjanimi + "!</h1>");
            out.println("<h2>Kirjauduit sisään: " + createTime + "</h2>");
            out.println("<h2>Kirjauduit sisään: " + lastAccessTime + "</h2>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
