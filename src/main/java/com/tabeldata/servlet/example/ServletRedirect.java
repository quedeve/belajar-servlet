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

        req.setAttribute("namaLengkap", req.getParameter("nama"));
        req.setAttribute("umur", req.getParameter("umur"));
        req.setAttribute("kelas", req.getParameter("kelas"));
        RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/belajar.jsp");
        rd.forward(req, resp);
    }
}
