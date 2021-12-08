package lt.codeacademy.api.controller;

import lt.codeacademy.api.entity.Post;
import lt.codeacademy.api.entity.Comment;
import lt.codeacademy.api.service.CommentService;
import lt.codeacademy.api.service.PostService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
public class CommentController {

    private final CommentService commentService;
    private PostService postService;

    public CommentController(CommentService commentService) {
        this.commentService = commentService;
        this.postService = postService;
    }

    @GetMapping(value = "/posts/{postId}/comments", produces = APPLICATION_JSON_VALUE)
    public List<Comment> getAllCommentsByPostId(@PathVariable (value = "postId") UUID postId) {
        return commentService.getAllCommentsByPostId(postId);
    }

}
