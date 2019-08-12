/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

window.onload = cargarImagenes;

function cargarImagenes() {
    for(var i = 0; i < document.images.length; i++) {
        if(document.images[i].parentNode.tagName === "A") {
            configuraRollover(document.images[i]);
        }
    }
}

function configuraRollover(imagen) {
    console.log(imagen);
    imagen.imagenOff = new Image();
    imagen.imagenOff.src = "button_off.jpg";
    imagen.onmouseout = cambiaOff;
    
    imagen.imagenOn = new Image();
    imagen.imagenOn.src = "button_on.jpg";
    imagen.onmouseover= cambiaOn;
    
}

function cambiaOff() {
    this.src = this.imagenOff.src;
}

function cambiaOn() {
    this.src = this.imagenOn.src;
}

