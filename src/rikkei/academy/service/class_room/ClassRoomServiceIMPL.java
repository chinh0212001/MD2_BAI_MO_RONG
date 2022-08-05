package rikkei.academy.service.class_room;

import rikkei.academy.model.Class.ClassRoom;

import java.util.ArrayList;
import java.util.List;

public class ClassRoomServiceIMPL implements IClassRoomService {
    public static List<ClassRoom> classRoomsList = new ArrayList<>();
    static {
        classRoomsList.add(new ClassRoom(1,"JV062022"));
        classRoomsList.add(new ClassRoom(2,"JS072022"));
    }
    @Override
    public List<ClassRoom> findAll() {
        return classRoomsList;
    }
    @Override
    public void save(ClassRoom classRoom){
        classRoomsList.add(classRoom);
    }
}
