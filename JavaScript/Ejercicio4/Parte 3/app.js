const URL_DATOS = "https://ejemplo-d49a3.firebaseio.com/ingresos-gastos.json"

function getDatos() {
    let xhr = new XMLHttpRequest();
    xhr.open("GET",URL_DATOS);
    xhr.addEventListener("readystatechange", () => {
        if(xhr.readyState == 4){//peticion ha finalizado
            let datos = JSON.parse(xhr.responseText);
            let ul = document.getElementById("lista_datos");
            datos = Object.values(datos);
            console.log(datos);
            datos.forEach(elem => {
                console.log(elem);
                if(Object.values(elem)[1]> 0){
                ul.innerHTML += `<li style="background-color:green;"> ${Object.values(elem)[0]}
                ${Object.values(elem)[1]}</li>`;
                }
                else{
                    ul.innerHTML += `<li style="background-color:red;"> ${Object.values(elem)[0]}
                    ${Object.values(elem)[1]}</li>`;
                }
            });
        }
    });
    xhr.send();
}

function getDatosV2(){
    return fetch(URL_DATOS)
        .then(resp => {
            return resp.json();
        })
        .then(datos =>{
            console.log(datos);
            arrayDatos = [];
            for(let i in datos){
                arrayDatos.push(`<li> ${datos[i].concept} : ${datos[i].qty}</li>`);
                total += Number(datos[i].qty);
                document.getElementById("datos").innerHTML = arrayDatos.join("");
                document.getElementById("total").textContent = total +"€";
            }
        })
}

getDatosV2()

const btn = document.getElementById("btn-add");
btn.addEventListener("click",sendDatos());

function sendDatos(){
    const concepto = document.getElementById("concepto").value;
    const cantidad = document.getElementById("cantidad").value;
    fetch(URL_DATOS, {
        method: "POST",
        body: JSON.stringify({concept: concepto, qty: cantidad})
    }).then(resp => resp.json())
    .then(dato => {
        console.log(dato);
        getDatosV2();
    })  
}