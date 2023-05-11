package com.sithum.classroom.controller;

import com.sithum.classroom.model.Student;
import com.sithum.classroom.service.ClassRoomService;
import com.sithum.classroom.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.hibernate.mapping.Any;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/student")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @PutMapping("/{student}")
    @ResponseStatus(HttpStatus.OK)
    public Any saveStudent(@PathVariable("student") Student student){
        return studentService.saveStudent(student);
    }

    @DeleteMapping("/{student_id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteStudent(@PathVariable("student_id") Long id){
        studentService.deleteStudent(id);
    }

    @GetMapping("/{student_id}")
    @ResponseStatus(HttpStatus.OK)
    public Any findStudent(@PathVariable("student_id") Long id){
        return studentService.findStudent(id);
    }
}
