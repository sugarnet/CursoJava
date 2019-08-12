/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

window.onload = iniciaDatos;

/**
 * 
 * Función que se manda a llamar cuando se carga la página html
 */
function iniciaDatos() {
    document.getElementById("link").onclick = validaSalir;
    document.getElementById("linkSearch").onclick = busqueda;
}

/**
 * función que valida si el usuario quiere salir o no de la página
 */
function validaSalir() {
    if(confirm("Desea salir de sitio?")) {
        alert("Nos vamos a Google");
        return true;
    } else {
        alert("Nos quedamos en el sitio...");
        return false;
    }
}

/**
 * Función que pide una cadena para buscar en Google
 */
function busqueda() {
    //con la función promp capturamos info del usuario
    var respuesta = prompt("Escribe la cadena a buscar:");
    
    if(respuesta) {
        alert("Tu respuesta fue: " + respuesta);
        var nuevoLink = this + "search?q=" + respuesta;
        alert("Nuevo link" + nuevoLink);
        window.location = nuevoLink;
        return false;
    } else {
        alert("No se escribió ninguna cadena");
        return false;
    }
}


