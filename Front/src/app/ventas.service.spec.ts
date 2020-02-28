import { TestBed } from '@angular/core/testing';

import { ventasService } from './ventas.service';

describe('EmployeeService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: ventasService = TestBed.get(ventasService);
    expect(service).toBeTruthy();
  });
});
