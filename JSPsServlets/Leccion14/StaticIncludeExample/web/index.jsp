<%-- 
    Document   : index
    Created on : 20/09/2018, 06:26:20
    Author     : almis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Static Include Example</title>
        <script type="text/javascript" src="resources/functions.js"></script>
        <link type="text/css" rel="stylesheet" href="resources/styles.css">
    </head>
    <body>
        <h1>Inclusi&oacute;n de archivos est&aacute;ticos</h1>
        <br>
        <span class="news">
            <a href="javascript:show('news')">
                <img border="0" src="http://icursos.net/cursos/ServletsJSPs/Leccion14/noticias.gif">
            </a>
        </span>
        <span id="news" class="hide_menu">
            <ul>
                <li><%@include file="pages/news1.html" %></li>
                <li><%@include file="pages/news2.html" %></li>
            </ul>
        </span>
        <br>
        <span class="videos">
            <a href="javascript:show('videos')">
                <img border="0" src="http://icursos.net/cursos/ServletsJSPs/Leccion14/videos.gif">
            </a>
        </span>
        <span id="videos" class="hide_menu">
            <ul>
                <li><%@include file="pages/video1.html" %></li>
            </ul>
        </span>
            
    </body>
</html>
