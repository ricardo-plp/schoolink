package com.school.link.schoollink.controller;

import com.school.link.schoollink.domaine.ClassRoom;

import com.school.link.schoollink.domaine.School;
import com.school.link.schoollink.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Controller
@CrossOrigin("http://localhost:3000/")
public class SchoolController {

    @Autowired
    SchoolService schoolService;

    @PostMapping("api/schoollink/add/school")
    public ResponseEntity<School> addSchool(@RequestBody School school){

        School school1 = schoolService.add(school);

        return  ResponseEntity.status(HttpStatus.OK).body(school1);
    }

    @GetMapping("api/schoollink/school/all")
    public ResponseEntity <List<School>> allSchool(){
        List<School> school2 = schoolService.all();

        return  ResponseEntity.status(HttpStatus.OK).body(school2);
    }

}
