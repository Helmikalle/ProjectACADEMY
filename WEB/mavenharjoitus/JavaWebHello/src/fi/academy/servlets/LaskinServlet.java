package fi.academy.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Administrator on 1.11.2017.
 */
@WebServlet(name = "LaskinServlet", urlPatterns = "/LaskinServlet")
public class LaskinServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int nro1 = 0, nro2 = 0, tulos = 0;
        response.setContentType("text/html");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html lang='fi'>");
            out.println("<head>");
            out.println("<meta charset='utf-8'/>");
            out.println("<title>HelloServlet</title>");
            out.println("</head>");
            out.println("<body>");
            try {
                String num1 = request.getParameter("nro1");
                if (num1 != null) {
                    nro1 = Integer.parseInt(num1);
                }
                String num2 = request.getParameter("nro2");
                if (num2 != null) {
                    nro2 = Integer.parseInt(num2);
                }

            } catch (NullPointerException e) {
                out.println("WROONG");
            }

            tulos = nro1 + nro2;
            out.println("<h1>HelloServlet " + tulos + " sanoo Hello</h1>");
            out.println("</body>");
            out.println("</html>");
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
