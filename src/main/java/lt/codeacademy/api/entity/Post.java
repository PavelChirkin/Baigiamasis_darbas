package lt.codeacademy.api.entity;

import lombok.*;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;


@Setter
@Getter
@Entity
@Table(name = "Posts")
public class Post {
    @Id
    @GeneratedValue
    @Column(columnDefinition = "VARCHAR(36)", updatable = false)
    @Type(type = "uuid-char")
    private UUID id;
    @NotBlank
    private String title;
    @NotBlank
    private String anons;
    @NotBlank
    private String category;
    @Size(max = 1000)
    @NotBlank
    private String fulltext;
//    @OneToMany(mappedBy = "article", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//    private Set<Comment> commentSet;


}
