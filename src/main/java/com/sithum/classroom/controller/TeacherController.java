package com.sithum.classroom.controller;

import com.sithum.classroom.model.Student;
import com.sithum.classroom.model.Teacher;
import com.sithum.classroom.service.ClassRoomService;
import com.sithum.classroom.service.TeacherService;
import lombok.RequiredArgsConstructor;
import org.hibernate.mapping.Any;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/teacher")
@RequiredArgsConstructor
public class TeacherController {

    private final TeacherService teacherService;

    @PutMapping("/{student}")
    @ResponseStatus(HttpStatus.OK)
    public Any saveTeacher(@PathVariable("student") Teacher teacher){
        return teacherService.saveTeacher(teacher);
    }

    @DeleteMapping("/{teacher_id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteTeacher(@PathVariable("teacher_id") Long id){
        teacherService.deleteTeacher(id);
    }

    @GetMapping("/{teacher_id}")
    @ResponseStatus(HttpStatus.OK)
    public Any findTeacher(@PathVariable("teacher_id") Long id){
        return teacherService.findTeacher(id);
    }
}
