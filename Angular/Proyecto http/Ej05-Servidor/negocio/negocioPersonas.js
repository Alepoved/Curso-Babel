let personas = [
    {
        id        : 1,
        nombre    : 'Bart',
        direccion : 'C/Evergreen Terrace',
        telefono  : '555',
        correoE   : 'a@b.c'
    },
    {
        id        : 2,
        nombre    : 'Bud Spencer',
        direccion : 'C/Falsa, 123',
        telefono  : '123',
        correoE   : 'd@e.f'
    },
    {
        id        : 3,
        nombre    : 'Terence Hill',
        direccion : 'C/Pascual',
        telefono  : '456',
        correoE   : 'g@h.i'
    }
]

exports.insertar = function(persona){
    persona.id = Math.floor(Math.random()*1000000)
    personas.push(persona)
}

exports.buscar = function(id){
    return personas.find(function(p){
        return p.id==id
    })
}

exports.listar = function(){
    return personas
}







