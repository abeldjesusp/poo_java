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
@WebServlet(name = "RedireccionamientoServlet", urlPatterns = {"/RedireccionamientoServlet"})
public class RedireccionamientoServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String url = null;
        String tipoNavegador = request.getHeader("User-Agent");
        System.out.println("Tipo de navegador : " + tipoNavegador);
        if(tipoNavegador != null && tipoNavegador.contains("Trident")){
            url = "https://www.microsoft.com";
        }else if(tipoNavegador != null && tipoNavegador.contains("Firefox")){
            url = "https://www.firefox.com";
        }else if(tipoNavegador != null && tipoNavegador.contains("Chrome")){
            url = "https://www.google.com";
        }
        
        response.sendRedirect(url);
        
    }

}
