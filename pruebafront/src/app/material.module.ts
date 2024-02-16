import { NgModule } from "@angular/core";
import { MatDialogModule } from '@angular/material/dialog';
import { MatTableModule } from '@angular/material/table';
import {MatIconModule} from '@angular/material/icon';
import { MatCardModule } from '@angular/material/card';
import { MatButtonModule } from '@angular/material/button';

@NgModule({
    exports: [
        MatDialogModule,
        MatTableModule,
        MatIconModule,
        MatCardModule,
        MatButtonModule,
    ]
})

export class MaterialModule { }