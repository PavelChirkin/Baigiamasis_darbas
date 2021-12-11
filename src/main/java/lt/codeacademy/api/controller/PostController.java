package lt.codeacademy.api.controller;

import lt.codeacademy.api.entity.Post;
import lt.codeacademy.api.service.PostService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;

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

    @GetMapping(value = "/{id}", produces = APPLICATION_JSON_VALUE)
    public Post getPost(@PathVariable("id") UUID id) {
        return postService.getPost(id);
    }

    @PostMapping(consumes = APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public void createPost(@Valid @RequestBody Post post) {
         postService.createPost(post);
    }

    @PutMapping(consumes = APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void updatePost(@RequestBody Post post) {
        postService.updatePost(post);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletePost(@PathVariable("id") UUID id) {
        postService.deletePost(id);
    }

    @GetMapping("/search")
    public List<Post> searchPosts(@RequestParam String query) {
        return postService.findPosts(query);
    }

}
