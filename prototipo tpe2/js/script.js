"use strict"

document.addEventListener("DOMContentLoaded", cargar);

function cargar(){
    const carruseles = [...document.querySelectorAll(".juego-carrusel")];
    console.log(carruseles);
    const nxtBtn = [...document.querySelectorAll(".boton-derecha")];
    const antBtn = [...document.querySelectorAll(".boton-izquierda")];
}