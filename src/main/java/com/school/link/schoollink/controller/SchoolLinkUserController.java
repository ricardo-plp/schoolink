package com.school.link.schoollink.controller;

import com.school.link.schoollink.domaine.ClassRoom;
import com.school.link.schoollink.domaine.SchoolLinkUser;
import com.school.link.schoollink.service.ClassRoomService;
import com.school.link.schoollink.service.SchoolLinkUserService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;

@Controller
@CrossOrigin("http://localhost:3000/")
public class SchoolLinkUserController {
    @Autowired
    SchoolLinkUserService schoolLinkUserService;


    @PostMapping("api/schoollink/user/login")
    public  ResponseEntity<SchoolLinkUser> loginUser(@RequestBody SchoolLinkUser schoolLinkUser){

        SchoolLinkUser schoolLinkUser2 = schoolLinkUserService.login(schoolLinkUser);

        return ResponseEntity.status(HttpStatus.OK).body(schoolLinkUser2);
    }

    @PostMapping("api/schoollink/user/register")
    public  ResponseEntity<SchoolLinkUser> registerUser(@RequestBody SchoolLinkUser schoolLinkUser){

        SchoolLinkUser schoolLinkUser2 = schoolLinkUserService.register(schoolLinkUser);

        return ResponseEntity.status(HttpStatus.OK).body(schoolLinkUser2);
    }




}
