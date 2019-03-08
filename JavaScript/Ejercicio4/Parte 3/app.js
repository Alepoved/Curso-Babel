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
                ul.innerHTML += `<li> ${Object.values(elem)[0]}
                ${Object.values(elem)[1]}</li>`;
            });
        }
    });
    xhr.send();
}