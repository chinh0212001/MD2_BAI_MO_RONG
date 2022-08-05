package rikkei.academy.controller;

import rikkei.academy.model.Class.Students;
import rikkei.academy.service.students.StudentsServiceIMPL;

import java.util.List;

public class StudentsController {
    public List<Students> showListStudents(){
        return new StudentsServiceIMPL().findAll();
    }
    public void createStudents(Students students){
        new StudentsServiceIMPL().save(students);
    }
}
