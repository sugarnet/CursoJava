<%-- 
    Document   : reportExcel
    Created on : 19/09/2018, 06:26:24
    Author     : almis
--%>

<%@page errorPage="WEB-INF/errors.jsp" %>
<%@page import="utils.Convertions, java.util.Date" %>
<%@page contentType="application/vnd.ms-excel" pageEncoding="UTF-8"%>
<%
    String fileName = "report.xls";
    response.setHeader("Content-Disposition", "inline; filename=" + fileName);
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Reporte Excel</title>
        <style>
            table, th, td {
                border: 1px solid black;
            }
        </style>
    </head>
    <body>
        <h1>Reporte de Excel</h1>
        <br>
        <table>
            <tr>
                <th>Curso</th>
                <th>Descripción</th>
                <th>Fecha de inicio</th>
            </tr>
            <tr>
                <td>1. Fundamentos de Java</td>
                <td>Aprenderemos la sintaxis básica de Java</td>
                <td><%= Convertions.format("500") %></td>
            </tr>
            <tr>
                <td>2. Programación con Java</td>
                <td>Utilizaremos lo aprendido en el curso de fundamentos</td>
                <td><%= Convertions.format(new Date()) %></td>
            </tr>
        </table>
    </body>
</html>
