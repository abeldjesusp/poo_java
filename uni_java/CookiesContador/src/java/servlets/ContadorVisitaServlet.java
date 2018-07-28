package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Abel
 */
@WebServlet(name = "ContadorVisitaServlet", urlPatterns = {"/ContadorVisitaServlet"})
public class ContadorVisitaServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        //Declaramos la variable contador
        int contador = 0;
        //Si exite, obtenemos el contador de visitas actual
        Cookie[] cookies = request.getCookies();
        if(cookies != null){
            for(Cookie c : cookies){
                if(c.getName().equals("contadorVisitas")){
                    try{
                        //Obtenemos le valor del contador de visitas actual
                        contador = Integer.parseInt(c.getValue());
                    }catch(NumberFormatException e){
                        //En caso de error reiniciamos el contador de visitas a 0
                        contador = 0;
                    }
                }
            }
        }
        
        //Incrementamos el valor de visitas
        contador++;
        Cookie c = new Cookie("contadorVisitas", Integer.toString(contador));
        //La cookie se almacenara en el cliente una hora (3600seg)
        c.setMaxAge(3600);
        response.addCookie(c);
        
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Contador de visitas</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Contador de visitas de cada cliente : " + contador + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

}
