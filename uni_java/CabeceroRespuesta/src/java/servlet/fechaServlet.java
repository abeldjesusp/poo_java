package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet(name = "fechaServlet", urlPatterns = {"/fechaServlet"})
public class fechaServlet extends HttpServlet {

     protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        response.setHeader("refresh", "1");
        try (PrintWriter out = response.getWriter()) {
            //Obtenemos fecha actual y le aplicamos un formato
            Date fecha = new Date();
            SimpleDateFormat formateador = new SimpleDateFormat("'Hora actualizada' HH:mm:ss");
            String fechaConFormato = formateador.format(fecha);
           
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet fechaServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Fecha actualizada : " + fechaConFormato + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

}
