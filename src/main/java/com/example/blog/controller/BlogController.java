package com.example.blog.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.blog.model.Post;
import com.example.blog.repository.PostRepository;

/**
 * Created by nurkulov 11/19/19
 * HERE, NA
 */
@Controller
@RequestMapping()
public class BlogController {

    @Autowired
    PostRepository postRepository;

    @GetMapping("/posts")
    public ResponseEntity<List<Post>> getPosts() {
        List<Post> postsList = new ArrayList<>();
        postRepository.findAll().forEach(postsList::add);
        return ResponseEntity.ok(postsList);
    }

    @GetMapping("/posts/{id}")
    public ResponseEntity<Post> getPost(@PathVariable Long id) {
        return ResponseEntity.ok(postRepository.findPostById(id));
    }

    @PostMapping("posts")
    public ResponseEntity<Post> createPost(@RequestBody Post post) {
        return ResponseEntity.ok(postRepository.save(post));
    }

}
