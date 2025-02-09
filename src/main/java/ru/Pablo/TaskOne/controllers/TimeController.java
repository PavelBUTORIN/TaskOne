package ru.Pablo.TaskOne.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
class TimeController {

    @GetMapping("/time")
    public ResponseEntity<LocalDateTime> time(){
        return ResponseEntity.ok(LocalDateTime.now());
    }

    @GetMapping("/teachers")
    public List<String> teachers(){
        return List.of("Ярослав Викторович", "Богдан Валерьевич", "и ещё Славик!");
    }
}
