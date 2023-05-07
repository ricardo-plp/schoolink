package com.school.link.schoollink.repository;

import com.school.link.schoollink.domaine.ClassRoom;
import com.school.link.schoollink.domaine.School;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SchoolRepository extends JpaRepository<School, Long> {


}
