package ru.Pablo.TaskOne.entities;


import jakarta.persistence.*;
import lombok.Data;


import java.io.Serializable;


@Entity
@Table(name = "users")
@Data
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private long id;

    @Column(name="login", nullable = false, unique = true)
    private String login;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "email")
    private String email;

    @Column(name = "role")
    private  String role;

    @Column(name = "note")
    private String note;

}


