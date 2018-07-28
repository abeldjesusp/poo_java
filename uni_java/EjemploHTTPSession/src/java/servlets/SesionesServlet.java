package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(name = "SesionesServlet", urlPatterns = {"/SesionesServlet"})
public class SesionesServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        HttpSession sesion = request.getSession();
        String titulo = null;
        
        //Pedimos el atributo, y verificamos si existe
        Integer contadorVisitas = (Integer) sesion.getAttribute("contadorVisitas");
        
        //Si es igual a nulo, quiere decir que es la primera
        //vez que accedemos al recurso
        if(contadorVisitas == null){
            contadorVisitas = new Integer(1);
            titulo = "Bienvenido por primera vez";
        }else{
            //Si es distinto de nulo, incrementamos el contador
            titulo = "Bienvenido nuevamente";
            contadorVisitas++;
        }
        
        //En cualquier caso, agregamos el valor del contador
        // a la sesion        
        sesion.setAttribute("contadorVisitas", contadorVisitas);
        
        try (PrintWriter out = response.getWriter()) {            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet SesionesServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Titulo : " + titulo + "</h1>");
            out.println("<p>No. Accesos al recurso : " + contadorVisitas + "</p>");
            out.println("<p>ID de la sesion : " + sesion.getId() + "</p>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
