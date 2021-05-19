/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Utilidades;
import modelo.ValorPorAnio;
import modelo.Valoracion;

/**
 *
 * @author DAW2-PROFESOR
 */
public class ServletValoracion extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ServletValoracion</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ServletValoracion at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ArrayList<String> listaAnios = Utilidades.CalculaAnios();
        request.setAttribute("listaAnios", listaAnios);
        request.getRequestDispatcher("valoracion.jsp").forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        

        
        String nombre= request.getParameter("nombre");
        String precioNuevo = request.getParameter("precio_nuevo");
        String precioDesguace = request.getParameter("precio_desguace");
        String anioMat = request.getParameter("anioMat");
        Valoracion miValoracion = new Valoracion(Double.parseDouble(precioNuevo),
                Double.parseDouble(precioDesguace),Integer.parseInt(anioMat));
        
        
        request.setAttribute("nombre",nombre);
             
        request.setAttribute("miValoracion", miValoracion);
        //le envío otra vez la lista de años
        ArrayList<String> listaAnios = Utilidades.CalculaAnios();
        request.setAttribute("listaAnios", listaAnios);
        
      //lista de valoraciones
        ArrayList<ValorPorAnio> listaValoraciones = Utilidades.getValoresPorAnio(Double.parseDouble(precioNuevo),
                Double.parseDouble(precioDesguace), Integer.parseInt(anioMat));
        
        request.setAttribute("listaValoraciones", listaValoraciones);
        
        request.getRequestDispatcher("valoracion.jsp").forward(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
