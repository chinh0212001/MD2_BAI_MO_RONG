package rikkei.academy.view;

import rikkei.academy.controller.ClassRoomController;
import rikkei.academy.controller.StudentsController;
import rikkei.academy.model.Class.ClassRoom;
import rikkei.academy.model.Class.Students;
import rikkei.academy.service.class_room.ClassRoomServiceIMPL;
import rikkei.academy.service.students.StudentsServiceIMPL;

public class Main {
    public static void main(String[] args) {
        System.out.println("show ListClassRoom");
        System.out.println(new ClassRoomController().showListClassRoom());
        System.out.println("create classRoom");
        new ClassRoomController().createClassRoom(new ClassRoom(3,"JV082022"));
        System.out.println("LIST CLASS SAU KHI TAO");
        System.out.println(ClassRoomServiceIMPL.classRoomsList);
        System.out.println("Show List Students");
        System.out.println( new StudentsController().showListStudents());
        System.out.println("Create Students");
        new StudentsController().createStudents(new Students(3,"ba",ClassRoomServiceIMPL.classRoomsList.get(2)));
        System.out.println("LIST STUDENTS SAU KHI TAO");
        System.out.println(StudentsServiceIMPL.studentsList);

    }
}
