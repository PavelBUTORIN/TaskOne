package ru.Pablo.TaskOne.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TeacherService {
    private final List<String> list=List.of("Ярослав Викторович", "Богдан Валерьевич", "и ещё Славик!");

    public List<String> getTeachers(){
        return list;
    }
}
