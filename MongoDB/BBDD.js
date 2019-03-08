var arrayCategorias = ["Miedo","Accion","Thriller","Drama","Animacion"];

for(var i=0;i<4;i++){
db.netflixUsers.insert({"_id":i,username:"user"+i,"password":"abc"+i,"correo":"correo"+i+"@gmail.com","continuarViendo":[]})
//db.netflixFilms.insert({"_id":i,filmname:"film"+i,"categoria":arrayCategorias[Math.floor(Math.random()*4)],"director":"director"+i,"actores":[]})
db.netflixSeries.insert({"_id":i,name:"nombre"+i,"info":[{numEpisodio:i,temporada:i,titulo:"Un titulo",
descripcion:"Una descripcion"}],"duracion":24,"categoria":arrayCategorias[Math.floor(Math.random()*4)],"actores":[],"director":"director"+i})
}

db.netflixSeries.insert({"_id":4,name:"nombrePeli","info":[{edadRecomendada:16,
descripcion:"Una descripcion"}],"duracion":24,"categoria":arrayCategorias[Math.floor(Math.random()*4)],"actores":[],"director":"director"+i})

db.netflixSeries.insert({"_id":5,name:"nombre"+1,"info":[{numEpisodio:2,temporada:1,titulo:"Un titulo",
descripcion:"Una descripcion"}],"duracion":24,"categoria":arrayCategorias[Math.floor(Math.random()*4)],"actores":[],"director":"director"+i})