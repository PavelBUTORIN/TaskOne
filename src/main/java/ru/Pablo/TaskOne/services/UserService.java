package ru.Pablo.TaskOne.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.Pablo.TaskOne.entities.User;
import ru.Pablo.TaskOne.repositories.UserRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }
}
