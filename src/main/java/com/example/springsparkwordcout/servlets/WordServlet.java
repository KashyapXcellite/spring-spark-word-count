package com.example.springsparkwordcout.servlets;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class WordServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        doGet(request,response);
    }
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h3>Hello India!</h3>");
    }

}
