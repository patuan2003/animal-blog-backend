package com.server.blog.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "post_sections")
@NoArgsConstructor
@AllArgsConstructor
public class PostSection extends AbstractEntity {

    @ManyToOne
    @JoinColumn(name = "post_id")
    private Post post;

    @Column(name = "title")
    private String title;

    @Column(name = "content")
    private String content;

    @OneToMany(mappedBy = "section")
    private List<PostSectionImage> images;
}
