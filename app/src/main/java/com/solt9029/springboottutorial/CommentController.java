package com.solt9029.springboottutorial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CommentController {
    private final PostService postService;
    private final CommentService commentService;

    @Autowired
    public CommentController(PostService postService, CommentService commentService) {
        this.postService = postService;
        this.commentService = commentService;
    }

    @GetMapping("/comments")
    List<Comment> index() {
        return commentService.findAll();
    }

    @PostMapping("/posts/{postId}/comments")
    Comment create(@PathVariable(value = "postId") Long postId, @RequestBody Comment comment) {
        return postService.findById(postId).map(post -> {
            comment.setPost(post);
            return commentService.save(comment);
        }).orElseThrow(() -> new ResourceNotFoundException("not found"));
    }

    @DeleteMapping("/{id}")
    void destroy(@PathVariable Long id) {
        commentService.deleteById(id);
    }
}
