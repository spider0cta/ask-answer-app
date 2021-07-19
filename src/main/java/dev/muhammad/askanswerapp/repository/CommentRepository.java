package dev.muhammad.askanswerapp.repository;

import dev.muhammad.askanswerapp.domain.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
