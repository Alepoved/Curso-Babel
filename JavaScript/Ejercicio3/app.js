
// import Mascota from "./mascota.js";
const Masc = require("./mascota.js");

class coche{

    constructor(marca,modelo,color,sonido,propietario){
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.sonido = sonido;
        var _propietario = propietario;//atributo privado
        this.getPropietario = () => {
            return _propietario;
        }
        this.setPropietario = (propietario) => {
            _propietario = propietario;
        }
    }

    pitar(){
        console.log(this.sonido);
    }

    static getNumRuedas(){
        return 4;
    }


}

coche.prototype.getModelo = function(){
    return this.modelo;
}

coche.prototype.getInfo = function(){
    return this;
}

const coche1 = new coche("ford","kuga","rojo","pitar1","propietario1");
const coche4 = new coche("ford","fiesta","rojo","pitar2");
const coche2 = new coche("seat","ibiza","azul","pitar3");
const coche3 = new coche("citroen","bw2","amarillo","pitar4");

console.log(coche1._propietario); // no puedes acceder a la variable
console.log(coche1.getPropietario()); // private se acceden con gets y sets
coche1.setPropietario("propietario1_1");
console.log(coche1.getPropietario());

class Rectangulo {
    constructor(lado,altura){
        this.lado = lado;
        this.altura = altura;
    }

    getArea(){
        return this.lado * this.altura;
    }
}

class Cuadrado extends Rectangulo {
    constructor(lado){
        super(lado,lado);
    }
}

const cuadrado1 = new Cuadrado(3);
console.log(`area del cuadrado: ${cuadrado1.getArea()}`);

const perro = new Masc.Mascota("Tobby","perro");
const gato = new Masc.Mascota("Misifu","gato");
const loro = new Masc.Mascota("Sparrow","loro");

console.log(perro);