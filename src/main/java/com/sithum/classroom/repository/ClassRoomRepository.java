package com.sithum.classroom.repository;

import com.sithum.classroom.model.ClassRoom;
import com.sithum.classroom.model.Student;
import org.hibernate.mapping.Any;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface ClassRoomRepository extends JpaRepository<Any, Long> {
    Optional<Any> findBySkuCode();

    Optional<Any> findById();

    Optional<Any> save();

    Optional<Any> deleteById();
}
