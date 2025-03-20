package ru.Pablo.TaskOne.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class TeacherController {
    @GetMapping("/teachers")
    public ResponseEntity<List<String>> getTeachers(){
        return ResponseEntity.ok(List.of("Ярослав Викторович", "Богдан Валерьевич", "и ещё Славик!"));
    }
}
