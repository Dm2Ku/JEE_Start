package com.kuku.demo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.zip.GZIPOutputStream;

@WebServlet("/status")
public class StatusServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      // response.setStatus(HttpServletResponse.SC_OK);
       //response.sendRedirect("/hello");
       // response.sendError(HttpServletResponse.SC_BAD_REQUEST,"hrenyy");

      //  response.setHeader("Refresh","1");
        //System.out.println("hei");

        response.setHeader("Refresh","5;URL=https://google.com");

        }

    }

