import { Component, OnInit } from '@angular/core';
import { faAdd } from '@fortawesome/free-solid-svg-icons';
import { StudentService } from '../service/student.service';
import { ActivatedRoute, Router } from '@angular/router';
import { HttpClient } from '@angular/common/http';
import { Student } from '../interface/student';

@Component({
  selector: 'app-add-student-form',
  templateUrl: './add-student-form.component.html',
  styleUrls: ['./add-student-form.component.css']
})
export class AddStudentFormComponent implements OnInit{

  faAdd = faAdd;

  isEditMode : boolean = false;

  studentToUpdate:any;

  // Properties from the interface
  numEtudiant: number= 1;
  nom: string="";
  prenom: string="";
  adresse: string="";
  sexe: string="";
  date_naissance: Date= new Date();
  Tel: string="";
  mention: string="";
  AnneePromo: number= 0;

  constructor(private studentService : StudentService ,
              private router: Router,
              private http : HttpClient,
              private route:ActivatedRoute){}


  ngOnInit(): void {
    this.route.queryParams.subscribe(params =>
      {
        this.studentID = params['studentID'];
        this.isEditMode = !!this.studentID;})

        if (this.isEditMode) {
          this.loadStudent();

        }
  }


  loadStudent() {
    this.studentService.getStudentByID(this.studentID).subscribe(
      (student: Student) => {
        this.studentToUpdate = student;
        console.log(student);
      },
      (error) => {
        console.error('Error loading student details:', error);
      }
    );
  }
  studentID : number = 0;

  onSubmit() {
    const formData: Student = {
      id: this.studentID, // Assuming studentId is available for edit mode
      numEtudiant: this.numEtudiant,
      nom: this.nom,
      prenom: this.prenom,
      adresse: this.adresse,
      sexe: this.sexe,
      date_naissance: this.date_naissance,
      Tel: this.Tel,
      mention: this.mention,
      AnneePromo: this.AnneePromo,
    };

    if (!this.isEditMode) {
      this.studentService.addStudent(formData).subscribe(
        (createdStudent) => {
          console.log("New student created: ", createdStudent);
          localStorage.setItem("StudentId", createdStudent.id.toString());
          this.router.navigate(['/task_creation'], { queryParams: { studentId: createdStudent.id } });
        },
        (error) => {
          console.error('Error creating student: ', error);
        }
      );
    } else {
      this.studentService.updateStudent(formData).subscribe(
        (updatedStudent) => {
          console.log(formData);
          console.log("Student Updated");
          this.router.navigate(['/addstudent']);
        },
        (error) => {
          console.error("Error updating student:", error);
        }
      );
    }

  }
}
