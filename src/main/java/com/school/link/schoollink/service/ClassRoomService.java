package com.school.link.schoollink.service;

import com.school.link.schoollink.domaine.ClassRoom;
import com.school.link.schoollink.repository.ClassRoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClassRoomService {

    @Autowired
    ClassRoomRepository classRoomRepository;

    public ClassRoom add(ClassRoom classRoom) {
        return classRoomRepository.save(classRoom);
    }
}
