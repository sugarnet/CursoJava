/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

window.onload = configSelect;

function configSelect() {
    document.getElementById("selectFaq").onchange = changePage;
}

function changePage() {
    var elementSelect = document.getElementById("selectFaq");
    var newPage = elementSelect.value;
    
    if(newPage !== "") {
        window.location = newPage;
    }
}

