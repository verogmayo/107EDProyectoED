<!--Página HTML en JSP para sumar dos números-->
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head><title>Suma JSP</title></head>
<body>
    <form method="get">
        Número 1: <input type="number" name="num1" required><br>
        Número 2: <input type="number" name="num2" required><br>
        <input type="submit" value="Sumar">
    </form>
    <%
        String n1 = request.getParameter("num1");
        String n2 = request.getParameter("num2");
        if (n1 != null && n2 != null) {
            int suma = Integer.parseInt(n1) + Integer.parseInt(n2);
            out.println("<p>Resultado: " + suma + "</p>");
        }
    %>
</body>
</html>
