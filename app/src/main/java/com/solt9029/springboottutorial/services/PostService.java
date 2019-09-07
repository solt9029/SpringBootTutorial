package com.solt9029.springboottutorial.services;

import com.solt9029.springboottutorial.entities.Post;
import com.solt9029.springboottutorial.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {
    private final PostRepository repository;

    @Autowired
    public PostService(PostRepository repository) {
        this.repository = repository;
    }

    public Post save(Post post) {
        return repository.save(post);
    }

    public Optional<Post> findById(Long id) {
        return repository.findById(id);
    }

    public List<Post> findAll() {
        return repository.findAll();
    }

    @Transactional
    public void transactional() throws RuntimeException {
        Post post1 = new Post();
        post1.setTitle("title 1");
        repository.save(post1);

        Post post2 = new Post();
        post2.setTitle("title 2");
        repository.save(post2);

        throw new RuntimeException();
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
