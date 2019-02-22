var gato;

gato ="Esto es un gato muy gordo";

alert(gato);

var primero = true;
var segundo = new Date();

document.write(typeof primero);
document.write(segundo.getTime());

function saludo(){
    var saludo = document.write("Hola a todos");
    return saludo;
}

function nombre(v1,v2){
    var data = document.write("<br>Mi nombre es: "+v1+"<br> Mi apellido es: "+v2);

    return data;
}

function meses(...meses){
    for(let i of meses){
        document.write("<br>"+i)
    }
}

nombre("Alejandro","Povedano");
meses("Enero", "Febrero", "Marzo", "Abril");