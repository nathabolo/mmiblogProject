package com.mmiblogproject.repository;

import com.mmiblogproject.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
//Standard way of persisting objects into a relational database using JpaRepository
public interface CommentRepository extends JpaRepository<Comment, Long> {
}
