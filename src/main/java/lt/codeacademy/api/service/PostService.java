package lt.codeacademy.api.service;

import lt.codeacademy.api.entity.Post;
import lt.codeacademy.api.exception.PostNotFoundException;
import lt.codeacademy.api.repository.PostRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class PostService {

    private final PostRepository postRepository;

    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public void createPost(Post post) {
        postRepository.save(post);
    }

    public List<Post> getPosts() {
        return postRepository.findAll();
    }

    public Post getPost(UUID id) {
        return postRepository.findById(id).orElseThrow(() -> new PostNotFoundException(id));
    }

    public boolean postExists(UUID id) {
            return postRepository.findById(id).isPresent();
    }

    public void updatePost(Post post) {

        postRepository.save(post);
    }

    public void deletePost(UUID id) {
        postRepository.deleteById(id);
    }

    public List<Post> findPosts(String query) {
        query = "%" + query + "%";
        return postRepository.findByTitleLikeOrCategoryLike(query, query);
    }

}
