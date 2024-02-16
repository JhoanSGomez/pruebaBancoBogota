import { Component, OnInit, Input, Output, EventEmitter } from '@angular/core';
// Importacion de servicios
import { ClientService } from '../../client.service';
// Importacion de clases necesarias para manejar formularios reactivos y el routing
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
// Para las ventana modales
import Swal from 'sweetalert2';

@Component({
  selector: 'app-info-basic',
  templateUrl: './info-basic.component.html',
  styleUrls: ['./info-basic.component.css']
})
export class InformationBasic implements OnInit {
  //grupo de controles de nuestro formulario
  form!: FormGroup;

  @Input() data: any;
  @Input() hideInicio: any;
  @Output() cambioEstado = new EventEmitter<any>();
  //inyeccion de dependencias
  constructor(private client: ClientService, private fb: FormBuilder, private router: Router) { }

  //en ngOnInit() metemos todas las instrucciones que queremos que se ejecuten apenas se cree nuestro componente
  ngOnInit(): void {

    this.form = this.fb.group({
      name: ['', [ ]],
      lastname: ['', []],
    });

  }
  regresar(){
    this.hideInicio= true;
    this.cambioEstado.emit(this.hideInicio);
  }
}
