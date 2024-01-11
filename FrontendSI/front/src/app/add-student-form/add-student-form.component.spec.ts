import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AddStudentFormComponent } from './add-student-form.component';

describe('AddStudentFormComponent', () => {
  let component: AddStudentFormComponent;
  let fixture: ComponentFixture<AddStudentFormComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [AddStudentFormComponent]
    });
    fixture = TestBed.createComponent(AddStudentFormComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
