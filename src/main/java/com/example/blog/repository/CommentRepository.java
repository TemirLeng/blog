package com.example.blog.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.blog.model.Comment;

/**
 * Created by nurkulov 11/19/19
 * HERE, NA
 */
public interface CommentRepository extends PagingAndSortingRepository<Comment, Long> {

}
