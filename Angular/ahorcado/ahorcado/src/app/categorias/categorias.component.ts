import { Component, OnInit } from '@angular/core';
import { AhorcadoService } from '../ahorcado.service';

@Component({
  selector: 'app-categorias',
  templateUrl: './categorias.component.html',
  styleUrls: ['./categorias.component.css']
})
export class CategoriasComponent implements OnInit {
  categorias: Array<String> = [];
  categoria: string;

  constructor(private ahorcadoService: AhorcadoService) { }

  ngOnInit() {
    let observable = this.ahorcadoService.getCategorias();
    observable.subscribe(
      categs => this.categorias = categs
    );
  }

  cambiarCategoria(categoria: string) {
    this.ahorcadoService.categoria = categoria;
  }
}
