package com.server.blog.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "animal_images")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AnimalImage extends AbstractEntity {

    @ManyToOne
    @JoinColumn(name = "animal_id")
    private Animal animal;

    @Column(name = "image_url")
    private String imageUrl;

    @Column(name = "caption")
    private String caption;

}