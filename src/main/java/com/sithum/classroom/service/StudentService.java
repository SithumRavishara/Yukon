package com.sithum.classroom.service;

import com.sithum.classroom.model.Student;
import com.sithum.classroom.repository.ClassRoomRepository;
import lombok.RequiredArgsConstructor;
import org.hibernate.mapping.Any;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final ClassRoomRepository classRoomRepository;

    @Transactional(readOnly = true)
    public Any saveStudent(Student student){
        return classRoomRepository.save().get();
    }

    @Transactional(readOnly = true)
    public void deleteStudent(Long id){
        classRoomRepository.deleteById(id);
    }

    @Transactional(readOnly = true)
    public Any findStudent(Long id){
        return classRoomRepository.findById(id).get();
    }
}
