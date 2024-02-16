import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ConsulterInfoComponent } from './consulter-info.component';

describe('ConsulterInfoComponent', () => {
  let component: ConsulterInfoComponent;
  let fixture: ComponentFixture<ConsulterInfoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ConsulterInfoComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ConsulterInfoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
