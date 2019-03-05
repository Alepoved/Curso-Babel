const URL_GENEROS = "https://ejemplos-dc1c1.firebaseio.com/generos.json";
const URL_PELICULAS = "https://ejemplos-dc1c1.firebaseio.com/peliculas/";

function getGeneros() {
    let xhr = new XMLHttpRequest();
    xhr.open("GET",URL_GENEROS);
    xhr.addEventListener("readystatechange",() => {
        if(xhr.readyState == 4){ // peticion ha finalizado = 4
            console.log(xhr.responseText);
            const generos = JSON.parse(xhr.responseText);
            const option = prompt("Elige genero de peliculas");
            const generoElegido =  generos[parseInt(option)];
            let span = document.getElementById("tipo");
            span.textContent = generoElegido;
            getPeliculas(generoElegido);
        }
    });
    xhr.send();
}

//getGeneros();

function getPeliculas(genero) {
    const xhr = new XMLHttpRequest();
    xhr.open("GET",URL_PELICULAS +`${genero}.json`);
    xhr.addEventListener("readystatechange",() => {
        if(xhr.readyState == 4){
            let peliculas = JSON.parse(xhr.responseText);
            peliculas = Object.values(peliculas)[0];
            console.log(peliculas);
            let ul = document.getElementById("lista-peliculas");
            ul.innerHTML = peliculas.map(elem =>
                `<li> ${elem} </li>`).join("");
        }
    })
    xhr.send();
}

function getGenerosProm() {
    return fetch(URL_GENEROS)
    .then(resp => {
        return resp.json();
     });
}

function getPeliculasProm(genero) {
    return fetch(URL_PELICULAS+`${genero}.json`)
    .then(resp => {
        return resp.json();
    });
}

// getGenerosProm()
//     .then(generos => {
//         const option = prompt("Elige genero de peliculas");
//         const generoElegido =  generos[parseInt(option)];
//         let span = document.getElementById("tipo");
//         span.textContent = generoElegido;
//         return getPeliculasProm(generoElegido);
//     }).then(peliculas => {
//         peliculas = Object.values(peliculas)[0];
//         console.log(peliculas);
//         let ul = document.getElementById("lista-peliculas");
//         ul.innerHTML = peliculas.map(elem =>
//             `<li> ${elem} </li>`).join("");
//     }).catch(err => {
//         console.log("ERROR :(");
//     });

start()
    .then(msg => {
        console.log(msg);
        return getGenerosProm();
    })
    .then(generos => {
        const option = prompt("Elige genero de peliculas");
        const generoElegido =  generos[parseInt(option)];
        let span = document.getElementById("tipo");
        span.textContent = generoElegido;
        return getPeliculasProm(generoElegido);
    }).then(peliculas => {
        peliculas = Object.values(peliculas)[0];
        console.log(peliculas);
        let ul = document.getElementById("lista-peliculas");
        ul.innerHTML = peliculas.map(elem =>
            `<li> ${elem} </li>`).join("");
    }).catch(err => {
        console.log("ERROR :(");
    });



function start() {
    return new Promise((resolve,reject) => {
        setTimeout(() => {
            resolve("Mi promesa funciona :)");
        },3000) // cuando pasen 3 segundos
    });
}



