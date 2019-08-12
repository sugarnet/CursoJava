var oculto = true;

function verDetalle() {
    if (oculto == true) {
        mostrarDetalle();
    } else {
        ocultarDetalle();
    }
}

function mostrarDetalle() {
    document.getElementById("detalle").style.display = "inline";
    document.getElementById("btnDetalle").value = "Ocultar detalle";
    oculto = false;
}

function ocultarDetalle() {
    document.getElementById("detalle").style.display = "none";
    document.getElementById("btnDetalle").value = "Ver detalle";
    oculto = true;
}

//Funcion para seleccionar o deseleccinar todos los checkboxes de un formulario
function selectAllCheckboxes(controladorCheckbox) {
    //alert("controladorCheckbox:" + controladorCheckbox.checked);
    //
    //Recuperamos la forma y el arreglo de checkboxes
    var forma = document.getElementById("form1");
    var personas = forma.personas;

    //El checkboxControlador define si se activan o desactivan los elementos individuales
    //Verificamos que sea un arreglo
    if (personas.length > 0) {
        for (i = 0; i < personas.length; i++) {
            personas[i].checked = controladorCheckbox.checked;
        }
    } else {
        if (personas != null) {
            personas.checked = controladorCheckbox.checked;
        }
    }

}

//Validacion del formulario de Personas
function validaFormularioListadoPersonas(boton) {
    //alert(boton.value);
    //Recuperamos la formay la accion para modificarla
    var forma = document.getElementById("form1");
    var accion = document.getElementById("accion");

    if (boton.value == "Agregar") {
        accion.value = "agregarPersona";
    } else if (boton.value == "Editar") {
        //Solo debe haber un elemento seleccionado
        if (this.validaUnicoCheckbox("personas")) {
            accion.value = "editarPersona";
        } else {
            alert("Debe seleccionar solo un elemento a Editar");
            return false;
        }
    } else if (boton.value == "Eliminar") {
        accion.value = "eliminarPersona";
    }

    //Enviamos el formulario
    forma.submit();
}
//Validacion del formulario de Personas
function validaFormularioListadoUsuarios(boton) {
    //alert(boton.value);
    //Recuperamos la formay la accion para modificarla
    var forma = document.getElementById("form1");
    var accion = document.getElementById("accion");

    if (boton.value == "Agregar") {
        accion.value = "agregarUsuario";
    } else if (boton.value == "Editar") {
        //Solo debe haber un elemento seleccionado
        if (this.validaUnicoCheckbox("usuarios")) {
            accion.value = "editarUsuarios";
        } else {
            alert("Debe seleccionar solo un elemento a Editar");
            return false;
        }
    } else if (boton.value == "Eliminar") {
        accion.value = "eliminarUsuario";
    }

    //Enviamos el formulario
    forma.submit();
}

//Validacion de solo un checkbox seleccionado
function validaUnicoCheckbox(tipo) {
    //Recuperamos la forma y el arreglo de checkboxes
    var forma = document.getElementById("form1");
    
    var registros;
    switch(tipo) {
        case "personas":
            registros = forma.personas;
            break;
        case "usuarios":
            registros = forma.usuarios;
            break;
    }

    //Verificamos si se selecciono mas de un elemento
    contadorCheckboxes = 0;

    //Verificamos que sea un arreglo
    if (registros.length > 0) {
        //Incrementamos el contador por cada
        for (i = 0; i < registros.length; i++) {
            if (registros[i].checked) {
                contadorCheckboxes++;
            }
        }
    } else {
        //Esto sucede cuando solo hay un elemento en la tabla, hay que recordar
        //que dinamicamente podrian eliminarse las personas y solo dejar un registro
        //por lo que ya no genera un arreglo en javascript, sino un checkbox aislado
        if (registros != null && registros.checked) {
            contadorCheckboxes++;
        }
    }

    //Solo se debio haber seleccionado un elemento
    if (contadorCheckboxes == 1)
        return true;
    else
        return false;
}

/*Regresamos al listado*/
function cancelar(accion = "") {
    var forma = document.getElementById("form1");
    //Actualizamos el URL que tenia asignado el formulario
    //Para solicitar nuevamente el listado de personas, ya que estamos cancelando la modificacion
    window.location = forma.contexto.value + "/ServletControlador";
    
    console.log(accion);
    if(accion === "") {
        forma.accion.value = "listarPersonas";
    } else {
        forma.accion.value = accion;
    }
    forma.submit();
}

//Este evento nos permite detectar cuando damos click a una celda
function editaRegistro(renglonSeleccionado, source = "") {
    //console.log(renglonSeleccionado);
    //Recuperamos la formay la accion para modificarla
    var forma = document.getElementById("form1");
    var accion = document.getElementById("accion");

    if(source === "usuarios") {
        accion.value = "editarUsuarios";
        forma.usuarios[renglonSeleccionado - 1].checked = true;
    } else {
        accion.value = "editarPersona";
        forma.personas[renglonSeleccionado - 1].checked = true;
    }

    //Enviamos el formulario
    forma.submit();
}
