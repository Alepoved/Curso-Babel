import { Component, OnInit, Input } from '@angular/core';
import { AhorcadoService } from '../ahorcado.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-juego',
  templateUrl: './juego.component.html',
  styleUrls: ['./juego.component.css']
})
export class JuegoComponent implements OnInit {
  palabraOriginal: string;
  palabra: string;
  palabraEnc: string;
  categoria: string;
  vidas: number;
  disabled: boolean;
  numAcertadas: number = 0;

  constructor(private ahorcadoService: AhorcadoService, private router: Router) {  }

  ngOnInit() {
    this.categoria = this.ahorcadoService.categoria;

    let observable = this.ahorcadoService.getPalabras(this.categoria);
    observable.subscribe(
      array => {
        this.palabra = array[Math.floor(Math.random() * array.length)].palabra;
        this.palabraOriginal = this.palabra;
        this.palabraEnc = this.palabra.split(" ").map(elem => "_".repeat(elem.length)).join(" ");
        let obs = this.ahorcadoService.getIntentos({"palabra":this.palabraOriginal});
        obs.subscribe(
          data => {
            this.vidas = data;
            console.log(data);
          }
        );
      }
    );
  }

  juega(letra: HTMLInputElement) {
    let acierta = false;
    this.disabled = true;

    for(let i = 0; i < this.palabra.length; i++) {
      if(this.palabra.toLowerCase().charAt(i) == letra.value) {
        let aux = this.palabraEnc.split("");
        aux[i] = letra.value;
        this.palabraEnc = aux.join("");
        acierta = true;
        this.numAcertadas++;
      }
    }

    if(!acierta) {
      let observable = this.ahorcadoService.getIntentos({"palabra":this.palabraOriginal});
      observable.subscribe(
        data => {
          this.vidas = data
          if(this.vidas == 0){
            alert("Has perdido.");
            this.router.navigate(['/']);
          }
        }
      );
    }

    console.log(this.numAcertadas);
    console.log(this.palabra.split(" ").join("").length);

    if(this.numAcertadas == this.palabra.split(" ").join("").length) {
      alert("¡Has ganado!");
      this.router.navigate(['/']);
    }

    this.palabra = this.palabra.replace(new RegExp(letra.value, "gi"), "&");
    letra.value = "";
    this.disabled = false;
  }
}
