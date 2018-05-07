package com.tabeldata.servlet.example;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "servletRedirect", urlPatterns = "/hello")
public class ServletRedirect extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doPost(req, resp);
        String nama = req.getParameter("nama");
        req.setAttribute("namaLengkap", nama);
        RequestDispatcher rd = req.getRequestDispatcher("/belajar.jsp");
        rd.forward(req, resp);
    }
}
