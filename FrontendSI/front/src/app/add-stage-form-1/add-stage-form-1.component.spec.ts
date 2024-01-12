import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AddStageForm1Component } from './add-stage-form-1.component';

describe('AddStageForm1Component', () => {
  let component: AddStageForm1Component;
  let fixture: ComponentFixture<AddStageForm1Component>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [AddStageForm1Component]
    });
    fixture = TestBed.createComponent(AddStageForm1Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
