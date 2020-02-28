import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { UpdateVentasComponent } from './update-ventas.component';

describe('UpdateVentasComponent', () => {
  let component: UpdateVentasComponent;
  let fixture: ComponentFixture<UpdateVentasComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ UpdateVentasComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(UpdateVentasComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
