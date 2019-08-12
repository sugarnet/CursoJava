/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

function show(category) {
    var menu = document.getElementById(category);
    
    if(menu.className === 'show_menu') {
        menu.className = "hide_menu";
    } else {
        menu.className = "show_menu";
    }
}

