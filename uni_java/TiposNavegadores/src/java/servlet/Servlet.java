/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
@WebServlet(name = "Servlet", urlPatterns = {"/Servlet"})
public class Servlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String titulo = null, mensaje = null;            
            String tipoNavegador = request.getHeader("User-Agent");
            
            System.out.println("Tipo de navegador : " + tipoNavegador);
            if(tipoNavegador != null && tipoNavegador.contains("Trident")){
                titulo = "Navegador Internet Explorer";
                mensaje = "Estas navegando con Internet Explorer";
            }else if(tipoNavegador != null && tipoNavegador.contains("Firefox")){
                titulo = "Navegador Firefox";
                mensaje = "Estas navegando con Firefox";
            }else if(tipoNavegador != null && tipoNavegador.contains("Chrome")){
                titulo = "Navegador Chrome";
                mensaje = "Estas navegando con Chrome";
            }
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>" + titulo+ "</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Tipo de navegador</h1>");
            out.println("<p>" + mensaje +"</p>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
