package com.solt9029.springboottutorial.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.solt9029.springboottutorial.validations.PostTitle;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @PostTitle
    private String title;

    @OneToMany(mappedBy = "post")
    @JsonIgnoreProperties("post")
    private List<Comment> comments;
}
