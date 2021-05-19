<%-- 
    Document   : valoracion
    Created on : 12-may-2021, 17:21:31
    Author     : DAW2-PROFESOR
--%>

<%@page import="modelo.Valoracion"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Valoración de Coches</h1>
        <% 
            ArrayList<String> listaAnios = ( ArrayList<String> ) request.getAttribute("listaAnios");
           String nombre=( String ) request.getAttribute("nombre");
           if (nombre==null) {
               nombre="";
           }
           Valoracion miValoracion = ( Valoracion ) request.getAttribute("miValoracion");
            double valorActual=0;
            double precioNuevo=0;
            double precioDesguace=0;
            int anioMat=0;
            if ( miValoracion!=null) {
                valorActual=miValoracion.getValorActual(); 
                precioNuevo=miValoracion.getPrecioNuevo();
                anioMat= miValoracion.getAnioMat();
            }
            
        %>
        <form action="ServletValoracion" method="post">
            <p><label>Nombre:</label><input type="text" value="<%=nombre%>" name="nombre"></p>
            <p><label>Precio Nuevo:</label><input type="text" name="precio_nuevo" value="<%=precioNuevo %>"></p>
            <p><label>Precio Desguace:</label><input type="text" name="precio_desguace" value="${miValoracion.precioDesguace}"></p>
            <p><label>Año matriculación:</label>
                <select name="anioMat">
                    <%

                        for ( String a: listaAnios ){
                          String cadenaSelected="";
                          if ( Integer.parseInt(a)==anioMat){
                              cadenaSelected = " selected ";
                          }
                          out.println("<option value=" + a + cadenaSelected+ ">" + a + "</option>" );
                      }
                       %>
                    
                </select>
            </p>
            <p><input type="submit" value="Valorar"></p>
            <h1>Valor Actual <%=valorActual %></h1>
        </form>
    </body>
</html>
