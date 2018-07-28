package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Abel
 */
@WebServlet(name = "FormularioServlet", urlPatterns = {"/FormularioServlet"})
public class FormularioServlet extends HttpServlet {
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
           String usuarioCorrecto = "Juan";
           String passCorrecto = "123";
           
           String pUsuario = request.getParameter("usuario");
           String pPassword = request.getParameter("password");
           
           if(usuarioCorrecto.equals(pUsuario) && passCorrecto.equals(pPassword)){
                out.println("<h1>Datos Correctos</h1>");
                out.println("<h4>Usuario : " + pUsuario + "</h4>");
                out.println("<h4>Password : " + pPassword + "</h4>");
           }else{
               response.sendError(response.SC_UNAUTHORIZED, "Las credenciales son incorrectas");
           }
           
           out.close();
        }
    }

}
