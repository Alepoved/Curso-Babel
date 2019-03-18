export class Tarea {

    constructor(private _id:number, private _nombre:string, private _completa:boolean = false){
        
    }

    get nombre(){return this._nombre;}
    get completa(){return this._completa;}
    get id():number{return this._id;}

    set nombre(newNombre:string){this._nombre = newNombre;}
    set completa(completa){this._completa = !this._completa;}
    set id(newId){this._id = newId;}
}
