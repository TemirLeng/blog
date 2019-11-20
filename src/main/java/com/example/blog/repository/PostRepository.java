package com.example.blog.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.blog.model.Post;

/**
 * Created by nurkulov 11/19/19
 * HERE, NA
 */

public interface PostRepository extends PagingAndSortingRepository<Post, Long> {

    Post save(Post post);

    Iterable<Post> findAll();

    Post findBlogByAuthor(String author);

    Post findPostById(Long id);

}
