package rikkei.academy.service.students;

import rikkei.academy.model.Class.Students;
import rikkei.academy.service.class_room.ClassRoomServiceIMPL;

import java.util.ArrayList;
import java.util.List;

public class StudentsServiceIMPL implements IStudentsService {
    public static List<Students>studentsList = new ArrayList<>();
    static {
        studentsList.add(new Students(1,"Chinh", ClassRoomServiceIMPL.classRoomsList.get(0)));
        studentsList.add(new Students(2,"Chi", ClassRoomServiceIMPL.classRoomsList.get(1)));
    }


    @Override
    public List<Students> findAll() {
        return studentsList;
    }

    @Override
    public void save(Students students) {
        studentsList.add(students);

    }
}
