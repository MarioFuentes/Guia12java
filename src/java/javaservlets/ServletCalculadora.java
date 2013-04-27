/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaservlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Mario
 */
public class ServletCalculadora extends HttpServlet {
PrintWriter printWriter;

    public void doPost(HttpServletRequest request, HttpServletResponse response)
    {
             response.setContentType("text/html");
            String str = request.getParameter("r1");
            String str1 = request.getParameter("t1");
            String str2 = request.getParameter("t2");
            String final_output = "";
            int num1 = 0;
            int num2 = 0;
            int num3 = 0;
            
            num1 = Integer.parseInt(str1);
            num2 = Integer.parseInt(str2);
            
            if(str.equals("sum"))
            {
                num3 = num1 + num2;
                final_output = "Suma";
            }
            else if(str.equals("resta"))
            {
                num3 = num1 - num2;
                final_output = "Resta";
            }
            else if(str.equals("mul"))
            {
                num3 = num1*num2;
                final_output = "Multiplicacion";
            }
            else if(str.equals("div"))
            {
                num3 = num1/num2;
                final_output = "Division";
            }
        try
        {
         printWriter = response.getWriter();
         printWriter.println("<p>");
         printWriter.println("La operacion matematica seleccionada es: ");
         printWriter.println(final_output);
         printWriter.println("</p>");
         printWriter.println("<p>");
         printWriter.println("El resultado es: " + num3);
         printWriter.println("</p>");
        }
        catch(Exception e)
        {
           printWriter.println(e.toString());
        }
    }
    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ServletCalculadora</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ServletCalculadora at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        } finally {            
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */

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
