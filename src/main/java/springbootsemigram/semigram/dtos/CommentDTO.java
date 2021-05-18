package springbootsemigram.semigram.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import springbootsemigram.semigram.models.Comment;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommentDTO {
    @NotNull(message = "Please provide the owner id")
    private long accountOwnerId;
    @NotNull(message = "Description cannot be blank")
    private String description;
    private String image;
    private LocalDate datePosted;

    public static Comment unpackDTO(CommentDTO dto) {
        Comment comment = new Comment();
        comment.setDescription(dto.getDescription());
        comment.setImage(dto.getImage());
        comment.setDatePosted(dto.getDatePosted());
        return comment;
    }

    public static CommentDTO packDTO(Comment comment) {
        CommentDTO commentDTO = new CommentDTO();
        commentDTO.setDescription(comment.getDescription());
        commentDTO.setImage(comment.getImage());
        return commentDTO;
    }
}
