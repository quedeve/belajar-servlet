package com.tabeldata.servlet.example;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ContohServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req, resp);
        String namaLengkap = req.getParameter("nama");
        String nim = req.getParameter("nim");
        resp.getWriter().append("Halo saya sedang belajar servlet, nama saya adalah " + namaLengkap + " dan nimnya adalah " + nim);
    }
}
