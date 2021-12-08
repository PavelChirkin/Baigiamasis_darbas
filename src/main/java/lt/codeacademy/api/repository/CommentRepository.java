package lt.codeacademy.api.repository;

import lt.codeacademy.api.entity.Post;
import lt.codeacademy.api.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface CommentRepository extends JpaRepository<Comment, UUID> {

    List<Comment> findByIdAndPostId(UUID id, UUID postId);

    List<Comment> findAllByPostId(UUID postId);
}
