nums = [1,2,3,4,5,6];

const res = nums.filter(function(nums){
    return nums!=3 && nums!=5;
}).map(function(nums){
    return "Elem "+nums;
});


(function () {
    console.log("Funcion autoejecutable");
}());

(function (algo) {
    console.log("esto es "+algo);
}("ALGO"));

/*OBJETOS*/

const coche ={
    marca: "Tesla",
    modelo: "Model 3",
    color: "Rojo",
    extra: "Extra"
};

console.log(coche.marca);
console.log(coche["modelo"]);

let prop = "color";
console.log(coche[prop]);

coche.color = "Blanco";
console.log(coche.color);

delete coche.extra;
coche.extra = "Nuevo extra";

coche.pitar = function () {
    console.log("PIIIIIIIII");
}
coche.pitar();

const coche2 = {
    marca: "Ferrari",
    modelo: "Sport 8",
}

class coche_class{
    
    constructor(marca,modelo,color){
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

}

function cocheF(marca,modelo,sonido,color) {
    this.marca = marca;
    this.modelo = modelo;
    this.color = color;
    this.sonido = sonido;
    // this.pitar = function () {
    //     console.log(this.pitar);
    // }
}

//Creamos 1 fuction pitar para todos los objetos coche
cocheF.prototype.pitar = function () { 
    console.log(this.sonido);
}

let seat = new cocheF("Seat","Ibiza","Pi pi pi","Verde");
console.log(seat);

const ford = new coche_class("Ford","Kuga","Gris");
console.log(ford);

function series(titulo,episodiosTotales,episodiosVistos,vista){
    this.titulo = titulo;
    this.episodiosTotales = episodiosTotales;
    this.episodiosVistos = episodiosVistos;
    this.vista = vista;
}

series.prototype.porVer = function(){
    console.log("Quedan por ver "+(this.episodiosTotales-this.episodiosVistos));
}

let dosHombres = new series("dosHombres",10,3,false);
let theMiddle = new series("theMiddle",10,10,true);
const arraySeries = [dosHombres,theMiddle];

function noFinalizadas(){
    return arraySeries.filter(function(elem){
        return !elem.vista;
    });
}

function noFinalizadas2(){
    return arraySeries.filter((elem, i) => {
        return !elem.vista;
    });
}

ejer14= [1,2,3,4,5];
console.log(ejer14.map(function(num){
    return num % 2 == 0 ? "PAR" : num;
}));

texto = "Paco viene con las rebajas";
t1 = texto.replace(/a/g,"&"); // expresion regular

/*
shift: quita 1º elemento array
unshift: añade 1º elemento array
pop: quita ultimo elemento
push: añade ultimo elemento
sort: ordena array
reverse: dar la vuelta los elems
join(,): devuelve string separado por comas
slice(pos,pos eliminar, elem añadir)
concat(array2): concatena arrays
*/

function palindromo(texto) {
    texto = texto.toLowerCase().replace(/ /g,"");
    array = texto.split("");
    array2 = array.reverse();
    texto2 = array2.join("");
    return texto2 == texto;

}
console.log("Robaba oro a babor");
console.log(palindromo("Robaba oro a babor"));

array = [1,2,3,4,5,6];




function miFiltro(array, miFuncion) {
    const resultado = [];
    array.forEach(function(elem){
        if(miFuncion(elem)){
            resultado.push(elem);
        }
    });
    return resultado;
}

console.log(miFiltro(["a b a","a a","a c"],palindromo));

array2 = [1,2,3,4,5,6,7];

function iterar(array2) {
    let cont = 0;
    array2.forEach(function(elem){
        cont++;
        console.log(elem); 
    });

    return cont;
}
console.log(iterar(array2));

persona ={
    nombre: "Alex",
    apellido: "Povedano"
}

let pj = JSON.stringify(persona);
JSON.parse(pj);

const nombre = "Alejandro";
const apellidos = "Povedano Atienza";

console.log(`Me llamo:
    ${nombre} 
    ${apellidos}`);

/*FUNCIONES FLECHAS*/

a = function(){
    console.log(a);
}

b = () => {
    console.log(b);
}

e = (n1,n2) => {
    return n1 + n2;
}

















