package springbootsemigram.semigram.dtos;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import springbootsemigram.semigram.models.Post;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostDTO {
    @NotNull(message = "Please provide the owner id")
    private long accountOwnerId;
    @NotNull(message = "Content cannot be blank")
    private String Content;
    private LocalDate dateCreated;

    public static Post unpackDTO(PostDTO dto) {
        Post post = new Post();
        post.setContent(dto.getContent());
        post.setDateCreated(dto.getDateCreated());
        return post;
    }

    public static PostDTO packDTO(Post post) {
        PostDTO postDTO = new PostDTO();
        postDTO.setContent(post.getContent());
        return postDTO;
    }
}
