package ru.Pablo.TaskOne;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication // Важно!
@ComponentScan("ru.Pablo.TaskOne")
public class TaskOneApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaskOneApplication.class, args);
	}
}


