import { Component, OnInit } from '@angular/core';
// Importacion de servicios
import { ClientService } from '../../client.service';
// Importacion de clases necesarias para manejar formularios reactivos y el routing
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
// Para las ventana modales
import Swal from 'sweetalert2';

@Component({
  selector: 'app-consulter-info',
  templateUrl: './consulter-info.component.html',
  styleUrls: ['./consulter-info.component.css']
})
export class ConsulterInfoComponent implements OnInit {
  hide = true;
  dataResponse = {};
  //grupo de controles de nuestro formulario
  form!: FormGroup;

  //inyeccion de dependencias
  constructor(private client: ClientService, private fb: FormBuilder, private router: Router) { }

  get botonDeshabilitado(): boolean {
    return !this.form.valid;
  }

  //en ngOnInit() metemos todas las instrucciones que queremos que se ejecuten apenas se cree nuestro componente
  ngOnInit(): void {

    this.form = this.fb.group({
      numeroDocumento: ['', [Validators.required, Validators.min(10000000), Validators.max(9999999999), Validators.minLength(8), Validators.maxLength(11)]],
      tipoDocumento: ['', [Validators.required]]
    });

  }

  limpiarCampos(regreso:any){
    this.hide=regreso;
    this.form.reset();

  }


  onSubmit() {
    // Si la validación del formulario es exitosa...
    if (this.form.valid) {
      console.log('Valores del formulario:', this.form.value);
      //se envian los datos del formulario mediante una solicitud POST, los valores de los inputs del formulario
      this.client.postRequestCliente('http://localhost:8090/mi-app/cliente', {
        numeroDocumento: this.form.value.numeroDocumento,
        tipoDocumento: this.form.value.tipoDocumento
      }).subscribe(
        (response: any) => {
          console.log(response);
          this.dataResponse = response;

          Swal.fire({
            icon: 'success',
            title: 'Búsqueda exitosa',
            background: '#fff',
            confirmButtonColor: '#0d6efd'
          });
          this.hide=false;

        },
        (error) => {
          console.log(error.status);
          Swal.fire({
            icon: 'error',
            title: 'Error',
            background: '#fff',
            confirmButtonColor: '#0d6efd'
          });
        }
      );
      
    } else {
      console.log('Form error');
      Swal.fire({
        icon: 'warning',
        title: 'Error',
        background: '#fff',
        confirmButtonColor: '#0d6efd'
      });
    }
  }
}
