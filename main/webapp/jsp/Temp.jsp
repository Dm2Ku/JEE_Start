<%@ page import="java.util.Date" %>
<%@ page import="jsp.JSPHelper" %><%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 19.11.2021
  Time: 12:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%--deklatation!--%>

<%! int i = 5; %>
<%! private  void doJob() {
  System.out.println("hello");
}%>
<%--exspresion= (to String)--%>

 <%--  <%= "hello world" %> --%>
<%= JSPHelper.minux(5 ,3) %>
<%--skriplete--%>

<%
class Student {
String name;
public String getName(){
return name;
}
public void setName(){
    this.name = name;
}

}
%>
<%=new Student().getName()%>


<%----------------%>

<% if(Math.random() > 0.5) {  %>
hello

<% } %>




</body>
</html>
