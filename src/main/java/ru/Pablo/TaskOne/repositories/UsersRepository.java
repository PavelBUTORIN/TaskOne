package ru.Pablo.TaskOne.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.Pablo.TaskOne.entities.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users,Long> {
}
