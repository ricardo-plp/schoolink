package com.school.link.schoollink.service;

import com.school.link.schoollink.domaine.SchoolLinkUser;
import com.school.link.schoollink.repository.SchoolLinkUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SchoolLinkUserService {

    @Autowired
    SchoolLinkUserRepository schoolLinkUserRepository;
    public SchoolLinkUser login(SchoolLinkUser schoolLinkUser) {
        Optional<SchoolLinkUser> schoolLinkUser2  = schoolLinkUserRepository.findByUserNameAndPassword(schoolLinkUser.getUserName(), schoolLinkUser.getPassword());
        if(schoolLinkUser2.isPresent()){
            return schoolLinkUser2.get();
        }
        return null;
    }

    public SchoolLinkUser register(SchoolLinkUser schoolLinkUser) {
        return schoolLinkUserRepository.save(schoolLinkUser);
    }
}
