package com.solt9029.springboottutorial.controllers;

import com.solt9029.springboottutorial.entities.Post;
import com.solt9029.springboottutorial.exceptions.ResourceNotFoundException;
import com.solt9029.springboottutorial.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/posts")
public class PostController {
    private final PostService service;

    @Autowired
    public PostController(PostService service) {
        this.service = service;
    }

    @GetMapping("")
    List<Post> index() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    Post show(@PathVariable Long id) {
        return service.findById(id).orElseThrow(() -> new ResourceNotFoundException("not found"));
    }

    @PostMapping("")
    Post create(@Valid @RequestBody Post post) {
        return service.save(post);
    }

    @DeleteMapping("/{id}")
    void destroy(@PathVariable Long id) {
        service.deleteById(id);
    }
}
