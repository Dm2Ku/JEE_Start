package com.kuku.demo;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/LiveCycle")
public class ServletLiveCycle extends HttpServlet {
    @Override
    public void init() throws ServletException{
        System.out.println("inintialisation");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("do Get method");
        String s = "<html>" +
                "<header><title>This is title</title></header>" +
                "<body>" +
                "Hello LiveCycle" +
                "</body>" +
                "</html>";
        response.getWriter().write(s);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
doGet(request, response);
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("service method");
        super.service(req, res);
    }

    @Override
    public void destroy() {
        super.destroy();
    }
}
