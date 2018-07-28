package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import javax.servlet.http.HttpSession;


@WebServlet(name = "CarritoServlet", urlPatterns = {"/CarritoServlet"})
public class CarritoServlet extends HttpServlet {

   
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        //Procesamos el nuevo articulo
        String articuloNuevo = request.getParameter("articulo");
        
        //Creamos o recuperamos la sesion http
        HttpSession sesion = request.getSession();
        
        //Recuperamos la lista de articulos previos
        //si es que existen en la sesion
        List<String> articulos = (List<String>) sesion.getAttribute("articulos");
        
        //Verificamos si la lista de articulos existe
        if(articulos == null){
            //Si no existen, inicializamos la lista
            //y la agregamos a la sesion
            articulos = new ArrayList<>();
            sesion.setAttribute("articulos", articulos);
        }
        
        //Ya tenemos la lista de articulos lista para trabajar
        //Agregamos el nuevo articulo
        //y lo agregamos por paso por referencia a la lista de
        //articulos
        if(articuloNuevo != null && !articuloNuevo.trim().equals(""))
            articulos.add(articuloNuevo);
        
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Carrito de compras</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Carrito de compras</h1>");
            //Iteramos todos los articulos, incluyendo el nuevo
            out.println("<ul>");
            for(String articulo : articulos){
                out.println("<li>" + articulo + "</li>");
            }
            out.println("</ul>");
            out.println("<br>");
            out.println("<a href='/CarritodeCompras'>Regresar</a>");
            out.println("</body>");
            out.println("</html>");
        }
    }

}
