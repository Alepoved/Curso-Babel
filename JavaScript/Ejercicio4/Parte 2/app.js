// let sumaCartas = 0;
// let sumaCartasCPU = 0;
// let finalizado = false;

// function generaCarta(){
//     const option = confirm("¿Quieres una carta?");
//     if(option == true){
//         let randomNum =  Math.floor((Math.random() * 10 )+1);
//         sumaCartas += randomNum;
//         console.log("La suma de tus cartas es: "+sumaCartas);
//     }
//     else {
//         generaCartaCPU();
//     }
// }

// function generaCartaCPU(){
//     while(sumaCartasCPU < 17){
//         let randomNum =  Math.floor((Math.random() * 10 )+1);
//         sumaCartasCPU += randomNum;
//     }
//     console.log("La suma de CPU: ",sumaCartasCPU);
//     if(sumaCartas <=20){
//         if(sumaCartasCPU <=20 && 20-sumaCartas < Math.abs(20-sumaCartasCPU))  console.log("Has ganado :)");

//         else console.log("Has perdido :(");

      
//         }

//         finalizado = true;
   
// }

// while(!finalizado){
//     generaCarta();
// }



//ejercicio 2

function ordenar(){
    let ul = document.getElementById("lista");
    ul.removeChild(ul.children[2]);

    let nodoLi = document.createElement("li");
    let textoLi = document.createTextNode("2");
    nodoLi.appendChild(textoLi);
    ul.insertBefore(nodoLi,ul.children[1]);

    textoLi = document.createTextNode("4");
    nodoLi = document.createElement("li");
    nodoLi.appendChild(textoLi);
    ul.insertBefore(nodoLi,ul.children[3]);
}



//ejercicio 3
let posImage = 0;


let btn_izq = document.getElementById("btn_izq");
btn_izq.addEventListener("click",function(event){
    posImage > 0 ? posImage-- : posImage = 2;
    let img1 = document.getElementsByTagName("img");
    switch(posImage){
        case 0:{
            img1[0].src="homer-simpson2.JPG";
        };break;
        case 1:{
            img1[0].src="homer-simpson.JPG";
        };break;
        case 2:{
            img1[0].src="homer-simpson3.JPG";
        };break;
    }
   
});

let btn_der = document.getElementById("btn_der");
btn_der.addEventListener("click",function(event){
    posImage < 2 ? posImage++ : posImage = 0;
    let img1 = document.getElementsByTagName("img");
    switch(posImage){
        case 0:{
            img1[0].src="homer-simpson2.JPG";
        };break;
        case 1:{
            img1[0].src="homer-simpson.JPG";
        };break;
        case 2:{
            img1[0].src="homer-simpson3.JPG";
        };break;
    }
   
});

let mouse = document.getElementById("overmouse");
mouse.onmouseover = function(){
    console.log("Has pasado el raton por encima");
}

function generarKeyboard() {
    let key = document.getElementById("input_key");
    console.dir(key);
    console.log(key.value);
}
let key = document.getElementById("input_key");
    
key.addEventListener("keydown", function(event){
        console.log(event.keyCode);
});










