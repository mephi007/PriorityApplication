package com.sumit.priority_application.models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity(name = "users")
public class User {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String email;

    @Enumerated(value = EnumType.STRING)
    private Role role;


    @OneToOne
    private List<Area> areas_of_priority;
}
