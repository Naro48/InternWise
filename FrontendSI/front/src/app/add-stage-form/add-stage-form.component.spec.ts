import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AddStageFormComponent } from './add-stage-form.component';

describe('AddStageFormComponent', () => {
  let component: AddStageFormComponent;
  let fixture: ComponentFixture<AddStageFormComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [AddStageFormComponent]
    });
    fixture = TestBed.createComponent(AddStageFormComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
