package com.solt9029.springboottutorial;

import com.solt9029.springboottutorial.validations.PostTitle;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @PostTitle
    private String title;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Comment> comments;
}
