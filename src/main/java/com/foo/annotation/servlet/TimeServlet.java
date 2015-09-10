package com.foo.annotation.servlet;

import javax.servlet.AsyncContext;
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
 * http://localhost/time
 *
 */
@WebServlet(urlPatterns = "/time" , asyncSupported = true)
public class TimeServlet extends HttpServlet {


    @Override
    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        response.getWriter().println("<h1>Hello ,welcome to Servlet 3.0 !</h1>");

        AsyncContext asyncContext = request.startAsync();
        TimeThread timeThread = new TimeThread(asyncContext);
        timeThread.start();

    }

    class TimeThread extends  Thread {

        AsyncContext asyncContext ;

        public TimeThread(AsyncContext asyncContext){
            this.asyncContext = asyncContext ;
        }

        public void  run(){

            int loop = 10 ;
            while (loop > 0) {

                loop-- ;

                try {
                    asyncContext.getResponse().getWriter().println("<h1> current time  " + System.currentTimeMillis()/1000 + "</h1>" );
                    asyncContext.getResponse().getWriter().flush();
                    Thread.sleep(500);
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        }

    }

}
