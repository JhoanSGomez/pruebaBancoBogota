import { ComponentFixture, TestBed } from '@angular/core/testing';

import { InformationBasic } from './info-basic.component';

describe('InformationBasic', () => {
  let component: InformationBasic;
  let fixture: ComponentFixture<InformationBasic>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ InformationBasic ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(InformationBasic);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
