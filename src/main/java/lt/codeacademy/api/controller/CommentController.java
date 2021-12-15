package lt.codeacademy.api.controller;

import lt.codeacademy.api.entity.Post;
import lt.codeacademy.api.entity.Comment;
import lt.codeacademy.api.exception.CommentNotFoundException;
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

    public CommentController(CommentService commentService, PostService postService) {
        this.commentService = commentService;
        this.postService = postService;
    }

    @GetMapping(value = "/posts/{postId}/comments", produces = APPLICATION_JSON_VALUE)
    public List<Comment> getAllCommentsByPostId(@PathVariable (value = "postId") UUID postId) {
        return commentService.getAllCommentsByPostId(postId);
    }

    @PostMapping("/posts/{postId}/comments")
    @ResponseStatus(HttpStatus.CREATED)
    public void createComment(@PathVariable (value = "postId") UUID postId,
                                 @Valid @RequestBody Comment comment) {
        //postService.getPost(postId).getCommentSet().add(comment);
        comment.setPost(postService.getPost(postId));
        commentService.saveComment(comment);
    }

    @PutMapping(value = "/posts/{postId}/comments", consumes = APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void updateComment(@PathVariable (value = "postId") UUID postId,
                              @Valid @RequestBody Comment comment) {
        if(postService.postExists(postId)) {
            comment.setPost(postService.getPost(postId));
            commentService.updateComment(comment);
        }
    }

    @DeleteMapping("/posts/{postId}/comments/{commentId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteComment(@PathVariable(value = "postId") UUID postId, @PathVariable(value = "commentId") UUID id) {
        if(postService.postExists(postId)) {
            commentService.deleteComment(id);
        }
    }

}
