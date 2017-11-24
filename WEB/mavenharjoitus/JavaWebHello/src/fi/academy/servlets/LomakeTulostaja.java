package fi.academy.servlets;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

/**
 * Created by Administrator on 1.11.2017.
 */
@WebServlet(name = "LomakeTulostaja", urlPatterns = "/LomakeTulostaja")
public class LomakeTulostaja extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html lang='fi'>");
            out.println("<head>");
            out.println("<meta charset='utf-8'/>");
            out.println("<title>HelloServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>HelloServlet sanoo Hello</h1>");
            out.println("</body>");
            out.println("</html>");
        }
        private String tulostaRivit (HttpServletRequest request){
         StringBuilder sb = new StringBuilder ();
            Enumeration<String> =
    }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher rd = request.getRequestDispatcher("virhe.jsp");
        rd.forward(request,response);
        }
    }

