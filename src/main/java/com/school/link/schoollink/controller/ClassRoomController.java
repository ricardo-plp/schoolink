package com.school.link.schoollink.controller;

import com.school.link.schoollink.domaine.ClassRoom;
import com.school.link.schoollink.service.ClassRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
@CrossOrigin("http://localhost:3000/")
public class ClassRoomController {

    @Autowired
    ClassRoomService classRoomService;

    @PostMapping("api/schoollink/add/classroom")
    public ResponseEntity<ClassRoom> addClassroom(@RequestBody ClassRoom classRoom){

        ClassRoom classRoom1 = classRoomService.add(classRoom);

        return  ResponseEntity.status(HttpStatus.OK).body(classRoom1);
    }
}
