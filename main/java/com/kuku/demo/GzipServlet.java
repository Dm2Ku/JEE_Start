package com.kuku.demo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.zip.GZIPOutputStream;

@WebServlet("/gzip")
public class GzipServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
if(request.getHeader("accept-encoding").contains("gzip")){
    PrintWriter printWriter = new PrintWriter((new GZIPOutputStream(response.getOutputStream())));
    printWriter.write("hello gzip world");
        }

    }
}
