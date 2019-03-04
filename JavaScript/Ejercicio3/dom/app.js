// window.onload = function(){//espera hasta que la pagina se haya cargado
//     const h1 = document.querySelector("h1");
//     console.log(h1);
// }

// window.onload = function(){
//     const li = document.getElementsByClassName("mascota");
//     // const li = document.querySelector("li");
//     console.log(li[0]);
// }

const h1 = document.querySelector("h1");
const li = document.getElementsByClassName("mascota");
console.log(h1);
console.log(li);
console.log(li[0]);

function guardarMascota() {
    const res = document.getElementById("input_mascota");
    console.dir(res);
    console.log(res.value);
}

function cambiarTitulo(nuevoTitulo) {
    const h1 = document.querySelector("h1");
    h1.textContent = nuevoTitulo;
}

console.log(document.querySelector("ul").children);
console.log(h1.firstChild);

const ul = document.querySelector("ul");

//Añadir un nuevo element a ul
const nodoLi = document.createElement("li");
const textoLi = document.createTextNode("Periquito");
nodoLi.appendChild(textoLi);
ul.appendChild(nodoLi);

//version 2 añadir nuevo element
ul.innerHTML += "<li class='mascota'> Tiburon </li>";
ul.insertBefore(nodoLi,ul.children[2]);//añadir periquito(nodoLi), en la pos = 2

// ul.appendChild()
//parent Node

//modificar valor
// nodeValue
// texContent o innerText(todo el contenido)


//obtener nombre de las monedas (https://coinmarketcap.com/)
let listaItems = document.querySelectorAll(".currency-name-container.link-secondary");
let nombresMonedas = [];
for(let item of listaItems){
    nombresMonedas.push(item.textContent);
}
nombresMonedas.sort();

//añadir un evento por cada elemento li

function addEventListenersToListItems(){
    let list = document.getElementsByTagName("li");

    for(let item of list){
        // item.onclick = function(event){
        //     console.log(event);
        //     let elemLi = event.target;
        //     cambiarTitulo(elemLi.textContent);
        // }

        item.addEventListener("click",function(event){
                console.log(event);
                let elemLi = event.target;
                cambiarTitulo(elemLi.textContent);
            });
        item.addEventListener("click",function(event){
                let elemLi = event.target;
                console.log(elemLi.textContent);
            });
    }
}



let boton = document.getElementById("btn_guardar");
boton.addEventListener("click",function(event){
    const res = document.getElementById("input_mascota");
    console.log(res.value);
    ul.innerHTML += "<li class='mascota'>"+res.value+"</li>";
    res.value = "";
});
   

