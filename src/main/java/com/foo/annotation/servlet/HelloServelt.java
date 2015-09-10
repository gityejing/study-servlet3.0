package com.foo.annotation.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author bjliuyong
 * @version 1.0
 * @created date 15-9-10
 *
 * http://localhost/hello
 */
@WebServlet(urlPatterns = "/hello" )
public class HelloServelt extends HttpServlet {

    @Override
    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        response.getWriter().println("<h1>Hello ,welcome to Servlet 3.0 !</h1>");

        response.getWriter().println("<h1>Hello ,welcome to Servlet 3.0 !</h1>");
        response.getWriter().println("<h1>Hello ,welcome to Servlet 3.0 !</h1>");
        response.getWriter().println("<h1>Hello ,welcome to Servlet 3.0 !</h1>");



    }
}
