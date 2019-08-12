
var nombres = [];

function addName(event) {
    if(event.keyCode === 13) {
        var inputNombre = document.getElementById("nombre");
        var val = inputNombre.value;
        
        if(val !== "") {
            nombres.push(val);
            inputNombre.value = "";
        } else {
            return false;
        }
        
        var tableNombres = document.getElementById("nombres");
        var html = "";
        for (var i = 0; i < nombres.length; i++) {
            html += "<tr><th>"+(i+1)+"</th><td>"+nombres[i]+"</td></tr>";
        }
        tableNombres.innerHTML = html;
        
        console.log(nombres);
        
    }
}

function search(event) {
    if(event.keyCode === 13) {
        var inputNombre = document.getElementById("buscar");
        var val = inputNombre.value;
        
        if(val === "") {
            return false;
        }
        
        var labelResult = document.getElementById("result");
        for(var i = 0; i < nombres.length; i++) {
            if(val === nombres[i]) {
                labelResult.innerHTML = "El nombre está en la posición: " + (i+1);
            }
        }
        
    }
}