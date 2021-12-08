package lt.codeacademy.api.controller;

import lt.codeacademy.api.entity.Post;
import lt.codeacademy.api.service.PostService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("/posts")
public class PostController {

    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    /* @GetMapping
    public String sayHi(){
        return "Preved medved";
    } */

    @GetMapping(produces = APPLICATION_JSON_VALUE)
    public List<Post> getPosts() {
        return postService.getPosts();
    }

    @PostMapping(consumes = APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public void createPost(@Valid @RequestBody Post post) {
         postService.createPost(post);
    }
}
