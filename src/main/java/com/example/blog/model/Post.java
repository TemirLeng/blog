package com.example.blog.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

/**
 * Created by nurkulov 11/19/19
 * HERE, NA
 */
@Entity
@Table(name = "posts")
@Getter
@Setter
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "native")
    private Long          id;

    @CreationTimestamp
    private Date          createdDate;

    @Column(columnDefinition = "TEXT")
    private String        post;

    @Column
    private String        shortDescription;

    @Column
    private String        longDescription;

    @Column(nullable = false, length = 3)
    private String        author;

    @Column
    private String        email;

    @OneToMany(mappedBy = "post")
    private List<Comment> comments;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    // public List<String> getComments() {
    // return comments;
    // }
    //
    // public void setComments(List<String> comments) {
    // this.comments = comments;
    // }
}
