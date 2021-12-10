package com.kuku.demo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

@WebServlet("/head")
public class HeaderServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       // Enumeration<String> headerNames = request.getHeaderNames();
        //while(headerNames.hasMoreElements()) {
          //  String s = headerNames.nextElement();
         //   System.out.println(s + " = " + request.getHeader(s));
      //  }
        System.out.println(request.getAuthType());
        System.out.println(request.getContentLength());
        System.out.println(request.getContentType());
        System.out.println(request.getMethod());
        System.out.println(request.getRequestURI());
        System.out.println(request.getQueryString());
        System.out.println(request.getProtocol());
        response.setHeader("Content-Length", "100");

    }

}
