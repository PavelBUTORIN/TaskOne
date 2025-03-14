package ru.Pablo.TaskOne.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.Pablo.TaskOne.entities.Users;
import ru.Pablo.TaskOne.repositories.UsersRepository;

import java.util.List;

@RestController
@RequestMapping("/api/v2")
public class UsersController {

    private UsersRepository usersRepository;

    @Autowired
    public UsersController(UsersRepository usersRepository){
        this.usersRepository=usersRepository;
    }

    @GetMapping("/users/all")
    public List<Users> allUsers(){
        return usersRepository.findAll();
    }

}
