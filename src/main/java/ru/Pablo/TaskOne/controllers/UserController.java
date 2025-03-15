package ru.Pablo.TaskOne.controllers;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.Pablo.TaskOne.entities.User;
import ru.Pablo.TaskOne.repositories.UserRepository;
import ru.Pablo.TaskOne.services.UserService;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/users/all")
    public List<User> allUsers() {
        return userService.findAll();
    }

    @GetMapping("/teachers")
    public List<String> teachers(){
        return List.of("Ярослав Викторович", "Богдан Валерьевич", "и ещё Славик!");
    }


}
