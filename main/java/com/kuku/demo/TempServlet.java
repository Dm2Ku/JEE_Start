package com.kuku.demo;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Enumeration;
import java.util.Map;

@WebServlet("/temp")
public class TempServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String one = request.getParameter("one");
        String two = request.getParameter("two");
        response.getWriter().write("<html>" +
                "<head></head>" +
                "<body>" +
                "one = " + one +

                "<form action='temp' method='post'>" +

                "<textarea name='one'></textarea> " +
                "<input type='submit' name='submit'/>" +
                "</form>" +
                "</body>" +
                "</html>");
    }
        @Override
        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
doGet(request, response);

        }

    }






