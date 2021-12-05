package lt.codeacademy.api.controller;

import lt.codeacademy.api.entity.Post;
import lt.codeacademy.api.service.PostService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("/posts")
public class PostController {

    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping
    public String sayHi(){
        return "Preved medved";
    }

    @GetMapping(produces = APPLICATION_JSON_VALUE)
    public List<Post> getPosts() {
        return postService.getPosts();
    }
}
