package com.school.link.schoollink.repository;

import com.school.link.schoollink.domaine.SchoolLinkUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface SchoolLinkUserRepository extends JpaRepository<SchoolLinkUser, Long> {

    Optional<SchoolLinkUser> findByUserNameAndPassword(String userName, String password);


}