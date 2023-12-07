/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.DbConnection;
import dao.Product;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author bibek
 */
@WebServlet(name = "Login", urlPatterns = {"/Login"})
public class Login extends HttpServlet {


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
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name = request.getParameter("name");
        String password = request.getParameter("password");
        
        DbConnection db = new DbConnection();
        int value = db.check(name, password);
        HttpSession session = request.getSession();
        
        ArrayList<Product> pl = db.getProduct();
        
//        for(Product p : pl) {
//            System.out.println(p.price);
//        }
        
        if(value == 0) {    
            session.setAttribute("username", name);
            session.setAttribute("productList", pl);
            request.getRequestDispatcher("user.jsp").forward(request, response);
//            response.sendRedirect("user.jsp");
        } else if(value == 1) {
            session.setAttribute("username", name);
            response.sendRedirect("admin.jsp");
        } else {
            response.sendRedirect("index.html");
        }
    }

}
