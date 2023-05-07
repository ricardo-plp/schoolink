package com.school.link.schoollink.service;

import com.school.link.schoollink.domaine.School;
import com.school.link.schoollink.repository.SchoolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchoolService {

    @Autowired
    SchoolRepository schoolRepository;

    public School add(School school){
        return schoolRepository.save(school);
    }

    public List<School> all(){
        return schoolRepository.findAll();
    }
}
