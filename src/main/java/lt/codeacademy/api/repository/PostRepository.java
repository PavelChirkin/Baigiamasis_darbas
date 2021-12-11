package lt.codeacademy.api.repository;

import lt.codeacademy.api.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface PostRepository extends JpaRepository<Post, UUID> {

    List<Post> findByTitleLikeOrCategoryLike(String title, String category);

    @Query("select p from Post p where p.title like %:text% or p.category like %:text%")
    List<Post> findLike(@Param("text") String text);
}
