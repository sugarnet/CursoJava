/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

function sum() {
    try {
        var a = prompt("Valor a:", "");
        
        if(!a || isNaN(a)) {
            throw new Error("Valor inválido de a:" + a);
        }
        
        var b = prompt("Valor b:", "");
        
        if(!b || isNaN(b)) {
            throw new Error("Valor inválido de b:" + b);
        }
        
        var c = parseInt(a) + parseInt(b);
        alert("la suma es: " + c);
    } catch (e) {
        alert("El error es: " + e.message);
    }
}

