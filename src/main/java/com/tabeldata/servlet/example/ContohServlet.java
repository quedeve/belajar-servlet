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
        String kelas = req.getParameter("kelas");
        Integer umur = Integer.valueOf(req.getParameter("umur"));
        resp.getWriter().append("<html>" +
                "<head><title>Belajar Kirim nilai</title></head>" +
                "<body>" +
                "   Nama Lengkap : " + namaLengkap + "<br/>" +
                "   kelas : " + kelas + "<br/>" +
                "   umur : " + umur + "<br/>" +
                "</body>" +
                "</html>");
    }
}
