package com.sumit.priority_application.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Component
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String email;

    @Enumerated(value = EnumType.STRING)
    private Role role;

    private List<Area> areas_of_priority;
}
