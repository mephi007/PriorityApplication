package com.sumit.priority_application.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.*;


@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Component
@Table(name = "area")
public class Area {
    @Id
    @GeneratedValue
    private Long id;

    @Column(unique = true, nullable = false)
    private String priorityArea;
}
