package springbootsemigram.semigram.services;

import springbootsemigram.semigram.dtos.CommentDTO;
import springbootsemigram.semigram.exceptions.CommentServiceException;
import springbootsemigram.semigram.exceptions.verificationException;
import springbootsemigram.semigram.models.Comment;

import java.util.List;

public interface CommentService {
    void postComment(CommentDTO commentDTO);
    //void likeComment(String description);
    void listComment(CommentDTO commentDTO) throws CommentServiceException;
    void confirmDatePosted(String verificationToken) throws CommentServiceException, verificationException;
    List<CommentDTO> getAllComments();

    CommentDTO getCommentById(long id) throws CommentServiceException;
    CommentDTO getCommentByDescription(String description) throws CommentServiceException;
    Comment internalGetCommentByDescription(String description) throws CommentServiceException;
    boolean commentExists(String description);
    Comment internalSaveComment(String description);
}
