/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

function validarForm(form) {
    var user = form.usuario;
    
    if(user.value === "") {
        alert("Debe proporcionar un nombre de usuario");
        user.focus();
        user.select();
        return false;
    }
    
    if (user.value.length <= 3) {
        alert("Debe proporcionar un nombre de usuario mayor a 3 caracteres");
        user.focus();
        user.select();
        return false;
    }
    
    var pass = form.password;
    if(pass.value === "" || pass.value.length < 3) {
        alert("Debe proporcionar al menos 3 caracteres");
        pass.focus();
        pass.select();
        return false;
    }
    
    var tecnos = form.tecnologia;
    var checkSeleccionado = false;
    for(i = 0; i < tecnos.length; i++) {
        if(tecnos[i].checked) {
            checkSeleccionado = true;
            break;
        }
    }
    
    if(!checkSeleccionado) {
        alert("Debe seleccional al menos una tecnología");
        return false;
    }
    
    var generos = form.genero;
    var radioSeleccionado = false;
    
    for(i = 0; i < generos.length; i++) {
        if(generos[i].checked) {
            radioSeleccionado = true;
            break;
        }
    }
    
    if(!radioSeleccionado) {
        alert("Debe seleccionar un género");
        return false;
    }
    
    var ocupation = form.ocupacion;
    if(ocupation.value === "") {
        alert("Debe seleccionar una ocupación");
        return false;
    }
    
    alert("Formulario validado!");
    return true;
    
}
