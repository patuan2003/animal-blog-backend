package com.server.blog.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "post_section_images")
@NoArgsConstructor
@AllArgsConstructor
public class PostSectionImage extends AbstractEntity {

    @ManyToOne
    @JoinColumn(name = "section_id")
    private PostSection section;

    @Column(name = "image_url")
    private String imageUrl;

    @Column(name = "caption")
    private String caption;

}