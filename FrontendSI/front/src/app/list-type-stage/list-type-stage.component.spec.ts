import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListTypeStageComponent } from './list-type-stage.component';

describe('ListTypeStageComponent', () => {
  let component: ListTypeStageComponent;
  let fixture: ComponentFixture<ListTypeStageComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [ListTypeStageComponent]
    });
    fixture = TestBed.createComponent(ListTypeStageComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
