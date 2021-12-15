package lt.codeacademy.api.service;

import lt.codeacademy.api.entity.Post;
import lt.codeacademy.api.entity.Comment;
import lt.codeacademy.api.exception.CommentNotFoundException;
import lt.codeacademy.api.repository.CommentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class CommentService {

    private final CommentRepository commentRepository;

    public CommentService(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }
    public void saveComment(Comment comment) {
        commentRepository.save(comment);
    }

/*
    public Page<Comment> getComments(Pageable pageable) {
        return commentRepository.findAll(pageable);
    }	*/

    public void updateComment(Comment comment) {
        commentRepository.save(comment);
   }



    public void deleteComment(UUID id) {
        commentRepository.deleteById(id);
    }

    public Comment getComment(UUID id) {
        return commentRepository.findById(id).orElseThrow(() -> new CommentNotFoundException("id"));
    }

    public List<Comment> getAllCommentsByPostId(UUID postId) {
        return commentRepository.findAllByPostId(postId);
    }

    public boolean existsById(UUID id) {
        if(commentRepository.existsById(id)) {
            return true;
        }else{
            return false;
        }
    }
}
