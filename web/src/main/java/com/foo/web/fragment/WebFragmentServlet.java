package com.foo.web.fragment;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author bjliuyong
 * @version 1.0
 * @created date 15-9-10
 */
public class WebFragmentServlet extends HttpServlet {


    public WebFragmentServlet(){
        System.out.println("WebFragmentServlet");
    }

    @Override
    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.getRequestDispatcher("test.jsp").forward(request,response);
    }


}
