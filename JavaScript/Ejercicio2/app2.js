

function serie(titulo,epis_vistos,epis_totales,finalizada){
    this.titulo = titulo;
    this.epis_vistos = epis_vistos;
    this.epis_totales = epis_totales;
    this.finalizada = finalizada;
}

let serie1 = new serie("serie1",3,5,false);
let serie2 = new serie("serie2",5,5,true);
let serie3 = new serie("serie3",1,5,true);

const series = [serie1,serie2,serie3];

function finalizadas(){
    return series.filter((elem,i) => {
        console.log(`Serie nº ${i}, ${elem.titulo}`);
        return elem.finalizada; 
    });
}



function mapear() {
    const array = [1,2,3,4,5,6,7,8];
    
   return array.map((elem,i) => {
        return elem % 2 == 0 ? "PAR" : "IMPAR";
    });
}

function reemplazar() {
    const text = "Hola me llamo alejandro povedano";
    return text.replace(/ /g,"$");
}

function palindromo(text){
    text = text.toLowerCase().replace(/ /g,"");
    const res = text.split("");
    const aux = res.reverse();
    const aux2= aux.join("");
    return aux2 == text;
}

function myFilter(array,myFunction) {
    const resultado = [];
    array.forEach(elem => {
        if(myFunction(elem))
            resultado.push(elem);
    });
    return resultado;
}

console.log(myFilter(["a b a","a a","a c"],palindromo));



class coche{

    constructor(marca,modelo,color){
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }
}

coche.prototype.getModelo = function(){
    return this.modelo;
}

coche.prototype.getInfo = function(){
    return this;
}



const coche1 = new coche("ford","kuga","rojo");
const coche4 = new coche("ford","fiesta","rojo");
const coche2 = new coche("seat","ibiza","azul");
const coche3 = new coche("citroen","bw2","amarillo");

document.write("hola que tal");





