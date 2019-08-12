/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


function validarForm(form) {
    var name = form.name;
    var surname = form.surname;
    var email = form.email;
    var regexp =/^[a-zA-Z]+$/;
    var regexpEmail = /^(([^<>()\[\]\\.,;:\s@"]+(\.[^<>()\[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
    
    //console.log(name.value);
    if(!name.value.match(regexp)) {
        alert("Debe proporcionar un nombre válido");
        name.focus();
        name.select();
        return false;
    }
    if(!surname.value.match(regexp)) {
        alert("Debe proporcionar un apellido válido");
        name.focus();
        name.select();
        return false;
    }
    if(!email.value.match(regexpEmail)) {
        alert("Debe proporcionar un email válido");
        name.focus();
        name.select();
        return false;
    }
    
    
    
    alert("Formulario validado!");
    return true;
}