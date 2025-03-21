package ru.Pablo.TaskOne.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.Pablo.TaskOne.services.TeacherService;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class TeacherController {
    private final TeacherService teacherService;
    @GetMapping("/teachers")
    public ResponseEntity<List<String>> getTeachers(){
        return ResponseEntity.ok(teacherService.getTeachers());
    }
}
