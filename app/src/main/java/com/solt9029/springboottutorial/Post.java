package com.solt9029.springboottutorial;

import com.solt9029.springboottutorial.validations.PostTitle;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @PostTitle
    private String title;
}
