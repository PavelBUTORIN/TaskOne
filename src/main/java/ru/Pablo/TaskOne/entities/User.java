package ru.Pablo.TaskOne.entities;


import jakarta.persistence.*;
import lombok.*;


import java.io.Serializable;


@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

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


