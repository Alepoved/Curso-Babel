console.log("Hello world");
numero = 4;
nummero = "Un num";

var hola = "hola";
let adios = "adios";
console.log(hola+ " Caracola");

var n = 1;
let m = 1;

if(true){
    var n = 2;
    let m = 2;
    console.log("Dentro del if: "+n);
    console.log("Dentro del if: "+m);
}

console.log(n);
console.log(m);

console.log("Paco dijo 'te vienes?'");

let colores = ["Blanco","Gris","Negro"];

console.log(colores[-1]);

colores.push("Naranja");
colores[0] = "Verde";
colores[4] = "Caqui";
console.log(colores);

// alert("Esto es un alert");
// let nombre = prompt("Nombre: ");
// let apellidos = prompt("Apellidos: ");
// let confirmacion = confirm("Guardar cambios?");
// console.log("Nombre: "+nombre+" Apellidos: "+apellidos+" y"+ (confirmacion ? "" : " NO") + " ha confirmado los cambios");
// console.error("Esto es un error");

// function fizzbuzz(){
//     let nume = prompt("Numero: ");
//     let mensaje = "";
//     nume%3==0 ? mensaje+="Fizz " : "";
//     nume%5==0 ? mensaje+="Buzz" : "";
//     return mensaje;
// }

// console.log(fizzbuzz());

// for (let i = 0; i < colores.length; i++){
//     console.log(colores[i]);
// }

// for (let i of colores) {
//     console.log(i); 
// }

// let persona = {
//     nombre: "Robb",
//     apellido: "Stark"
// };

// for(let i of Object.values(persona)){
//     console.log(i);
// }

// function random(){
//    let randomNum =  Math.floor((Math.random() * 10));
//    var fin = false;

//    while(!fin){
//     let userNum = prompt("Numero entre el 0 y 10: ");
//     if(randomNum == userNum){
//         fin=true;
//         console.log("HAS ACERTADO!!");
//         if(confirm("Quieres volver a jugar?"))
//             random();
//     } 
//     else if(userNum < randomNum){
//          console.log("El numero es mayor");
//     }
//     else{
//      console.log("El numero es menor");
//     }
//     console.log(randomNum);
    
//    }
// }

// random();

[1,2,3,4].forEach(function(num){
    console.log(num);
});

const nums = [1,2,3,4];

const numDoble=nums.map(function(nums) {
    return nums*2;
});

console.log(numDoble);

const numMenores7 = numDoble.filter(function(num){
    return num < 7;
})

const suma = nums.reduce(function(acc,num){
    return acc += num;
})

const ejer = nums.filter(function(nums){
    return nums != 3;
}).map(function(nums){
    return "Item "+nums;
});










