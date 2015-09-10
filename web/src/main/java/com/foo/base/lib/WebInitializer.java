package com.foo.base.lib;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

/**
 * @author bjliuyong
 * @version 1.0
 * @created date 15-9-10
 */
public interface WebInitializer {

    public void onStartup(ServletContext ctx) throws ServletException ;
}
