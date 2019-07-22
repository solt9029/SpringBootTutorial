package com.solt9029.springboottutorial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    private final BookService service;

    @Autowired
    public BookController(BookService service) {
        this.service = service;
    }

    @CrossOrigin
    @PostMapping("")
    Book save(@RequestBody Book book) {
        return service.save(book);
    }

    @GetMapping("")
    List<Book> findAll() {
        return service.findAll();
    }

    @DeleteMapping("/{id}")
    void deleteById(@PathVariable Long id) {
        service.deleteById(id);
    }
}
