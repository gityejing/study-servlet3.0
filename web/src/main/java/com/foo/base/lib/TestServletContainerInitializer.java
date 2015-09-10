package com.foo.base.lib;

import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import javax.servlet.annotation.HandlesTypes;
import java.util.Set;

/**
 * @author bjliuyong
 * @version 1.0
 * @created date 15-9-10
 */
//@HandlesTypes(value = WebInitializer.class)
public class TestServletContainerInitializer implements ServletContainerInitializer {


    @Override
    public void onStartup(Set<Class<?>> c, ServletContext ctx) throws ServletException {
        //System.out.println(c.size());

        InitServlet initServlet = new InitServlet();
        ServletRegistration.Dynamic dynamic =  ctx.addServlet("initServlet", initServlet);

        dynamic.addMapping("/init");
        dynamic.setLoadOnStartup(1);

    }

    public static void main(String args[]){


       //Object o = ServiceLoader.load(ServletContainerInitializer.class ) ;

       //System.out.println(o);
    }
}
