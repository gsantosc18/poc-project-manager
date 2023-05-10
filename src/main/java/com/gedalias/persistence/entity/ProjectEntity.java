package com.gedalias.persistence.entity;

import com.gedalias.types.DurationType;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import static jakarta.persistence.EnumType.STRING;

@Entity
@Table(name = "project")
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class ProjectEntity extends PanacheEntityBase {
    @Id @GeneratedValue
    private Long id;
    private String name;
    private String description;
    private int duration;
    @Enumerated(STRING)
    private DurationType durationType;
}
