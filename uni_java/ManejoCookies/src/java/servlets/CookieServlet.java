package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "CookieServlet", urlPatterns = {"/CookieServlet"})
public class CookieServlet extends HttpServlet {

   
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        //Supongamos que el usuario esta visitando por primera vez nuestro sitio
        boolean nuevoUsuario = true;
        
        //Obtenemos todas las cookies
        Cookie[] cookies = request.getCookies();
        //Buscamos si ya existe una cookie creada con anterioridad
        //llamada visitanteRecurrente
        if(cookies != null){
            for(Cookie c : cookies){
                if(c.getName().equals("visitanteRecurrente") && c.getValue().equals("si")){
                    //En caso de que ya exita una cookie indicando que ya existe un 
                    //usuario registrado con anterioridad ponemos la bandera en falso
                    // y salimos del ciclo
                    nuevoUsuario = false;
                    break;
                }
            }//fin for
        }//fin if
        //Revisamos si el usuario es un nuevo visitante
        String mensaje = null;
        if(nuevoUsuario){
            //En caso de ser un usuario nuevo creamos el objeto cookie
            Cookie visitanteCookie = new Cookie("visitanteRecurrente","si");
            //Agregamos la cookie en la respuesta
            response.addCookie(visitanteCookie);
            mensaje = "Gracias por visitar nuestro sitio";
        }else{
            mensaje = "Gracias por visitar NUEVAMENTE nuestro sitio";
        }
        try (PrintWriter out = response.getWriter()) {

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CookieServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>"+ mensaje +"</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

}
