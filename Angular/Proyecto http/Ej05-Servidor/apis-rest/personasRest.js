let express = require("express")
let negocioPersonas = require("../negocio/negocioPersonas.js")
let utilidades = require("../util/utilidades.js")

//En lugar de crear una 'aplicacion' creamos un router

let router = express.Router()

router.get('/personas', listarPersonas)
router.get('/personas/:id', buscarPersona)
router.post('/personas', insertarPersona)
router.put('/personas/:id', modificarPersona)
router.delete('/personas/:id', borrarPersona)

exports.router = router

////////////////////////////////////////
// Funciones con la lógica de control //
////////////////////////////////////////
function listarPersonas(request, response){
    response.json(negocioPersonas.listar())
}

function buscarPersona(request, response){

    let id = request.params.id
    let persona = negocioPersonas.buscar(id)
    if(persona){
        response.json(persona)
    } else {
        let error = utilidades.crearError(404, "La persona con id "+id+" no existe")
        response.statusCode = 404
        response.json(error)
    }

}

function insertarPersona(request, response){
    let persona = request.body
    negocioPersonas.insertar(persona)
    response.json(persona)
}

function modificarPersona(request, response){
    response.statusCode = 501
    response.end("Sin implementar")
}

function borrarPersona(request, response){
    response.statusCode = 501
    response.end("Sin implementar")
}