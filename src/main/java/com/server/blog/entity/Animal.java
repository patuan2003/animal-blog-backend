package com.server.blog.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "animals")
@NoArgsConstructor
@AllArgsConstructor
public class Animal extends AbstractEntity {

    @Column(name = "name")
    private String name;

    @Column(name = "scientific_name")
    private String scientificName;

    @Column(name = "origin")
    private String origin;

    @Column(name = "avg_lifespan")
    private Integer avgLifespan;

    @Column(name = "weight_range")
    private String weightRange;

    @Column(name = "description")
    private String description;

    @OneToMany(mappedBy = "animal")
    private List<AnimalImage> images;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
}
