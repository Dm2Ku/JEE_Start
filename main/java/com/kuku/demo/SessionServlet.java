package com.kuku.demo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.Enumeration;

@WebServlet("/sess")
public class SessionServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        Enumeration<String> attributeNames = session.getAttributeNames();
while (attributeNames.hasMoreElements()) {
    String attributeName = attributeNames.nextElement();
    System.out.println(attributeName + " = " + session.getAttribute(attributeName));

}
session.setAttribute("one", "two");
        System.out.println(session.getMaxInactiveInterval());
session.removeAttribute("one");

    }
}

