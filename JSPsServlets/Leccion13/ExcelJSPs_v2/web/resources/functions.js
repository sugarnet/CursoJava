/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

var layer;

function change(id) {
    
    layer = document.getElementById(id).style;
    
    if(layer.getPropertyValue("visibility") === "hidden") {
        layer.setProperty("visibility", "visible");
    } else {
        layer.setProperty("visibility", "hidden");
    }
    
}

