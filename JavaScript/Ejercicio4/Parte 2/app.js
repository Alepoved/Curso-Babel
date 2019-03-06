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
let numKeys = 200;
key.addEventListener("keydown", function(event){
        event.keyCode == 8 ? numKeys++ : numKeys--;
        console.log(event.keyCode+" Quedan "+numKeys+" caracteres");
});

const arrayImages = [];
arrayImages[0] = "rock.jpg";
arrayImages[1] = "paper.jpg";
arrayImages[2] = "scissors.jpg";

function jugar() {
    let option;
    do{
        option = prompt("Piedra(0), Papel(1),Tijera(2)");
    }while(option<0 || option > 2);

    let randomNum =  Math.floor((Math.random() * 2 ));

    let imgPlayer = document.getElementById("img2");
    imgPlayer.src = `${arrayImages[option]}`;

    let imgVS = document.getElementById("vs");
    imgVS.src = "vs.png";

    let imgCPU = document.getElementById("img3");
    imgCPU.src = `${arrayImages[randomNum]}`;

    if(option == 0){
        randomNum == 0 ? console.log("Empate") : randomNum==1 ? console.log("Has perdido :(") : console.log("Has ganado :)") ;
    }
    else if (option == 1){
        randomNum == 0 ? console.log("Has ganado :)") : randomNum==1 ? console.log("Empate") : console.log("Has perdido :(") ;
    }
    else{
        randomNum == 0 ? console.log("Has perdido :(") : randomNum==1 ? console.log("Has ganado :)") : console.log("Empate") ;
    }
}

function mover(){
    let divMove = document.getElementById("move");
    let right = 0; let top = 0;
    let keyMove = document.addEventListener("keydown",function(event){
        if(event.keyCode == 39){//right
            right +=20;
            divMove.style.marginLeft = `${right}px`;
        }
        else if(event.keyCode == 37){//left
            right -=20;
            divMove.style.marginLeft = `${right}px`;
        }
        else if(event.keyCode == 38){//top
            top -=20;
            divMove.style.marginTop = `${top}px`;
        }
        else if(event.keyCode == 40){//bottom
            top +=20;
            divMove.style.marginTop = `${top}px`;
        }
       
    });
}

function getMiddle(s)
{
  //Code goes here!
  let array = [];
  array = s.split("");
  let res;
  let length = array.length;
  if(length % 2 == 0){
    res = array[length/2-1]+""+array[length/2];
  }
  else{
      console.log(length);
    res = array[Math.floor(length/2)];
}
return res;
}











