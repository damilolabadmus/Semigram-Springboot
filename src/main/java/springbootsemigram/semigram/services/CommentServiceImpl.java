package springbootsemigram.semigram.services;

import springbootsemigram.semigram.dtos.CommentDTO;
import springbootsemigram.semigram.exceptions.CommentServiceException;
import springbootsemigram.semigram.exceptions.verificationException;
import springbootsemigram.semigram.models.Comment;

import java.util.List;

public class CommentServiceImpl implements CommentService {
    @Override
    public void postComment(CommentDTO commentDTO) {

    }

    @Override
    public void listComment(CommentDTO commentDTO) throws CommentServiceException {

    }

    @Override
    public void confirmDatePosted(String verificationToken) throws CommentServiceException, verificationException {

    }

    @Override
    public List<CommentDTO> getAllComments() {
        return null;
    }

    @Override
    public CommentDTO getCommentById(long id) throws CommentServiceException {
        return null;
    }

    @Override
    public CommentDTO getCommentByDescription(String description) throws CommentServiceException {
        return null;
    }

    @Override
    public Comment internalGetCommentByDescription(String description) throws CommentServiceException {
        return null;
    }

    @Override
    public boolean commentExists(String description) {
        return false;
    }

    @Override
    public Comment internalSaveComment(String description) {
        return null;
    }
}
