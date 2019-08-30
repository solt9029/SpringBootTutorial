package com.solt9029.springboottutorial.services;

import com.solt9029.springboottutorial.entities.Comment;
import com.solt9029.springboottutorial.repositories.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {
    private final CommentRepository repository;

    @Autowired
    public CommentService(CommentRepository repository) {
        this.repository = repository;
    }

    public Comment save(Comment comment) {
        return repository.save(comment);
    }

    public List<Comment> findAll() {
        return repository.findAll();
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
