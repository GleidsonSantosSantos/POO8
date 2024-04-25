<!-- saque.jsp -->
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Saque</title>
</head>
<body>
    <h1>Saque</h1>
    <form action="RealizarSaqueServlet" method="post">
        Cliente: <input type="text" name="cliente"><br>
        Número da Conta: <input type="text" name="numConta"><br>
        Valor do Saque: <input type="text" name="valor"><br>
        <input type="submit" value="Saque">
    </form>
</body>
</html>
