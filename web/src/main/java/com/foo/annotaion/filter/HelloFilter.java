package com.foo.annotaion.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @author bjliuyong
 * @version 1.0
 * @created date 15-9-10
 */
@WebFilter(servletNames = {"helloServlet"} ,filterName = "HelloFilter")
public class HelloFilter implements Filter{
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("===========doFilter==============");
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
    }
}
