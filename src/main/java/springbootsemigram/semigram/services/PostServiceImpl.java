package springbootsemigram.semigram.services;

import springbootsemigram.semigram.dtos.PostDTO;
import springbootsemigram.semigram.exceptions.PostException;
import springbootsemigram.semigram.models.Post;

import java.util.List;

public class PostServiceImpl implements PostService{

    @Override
    public void createPost(PostDTO postDTO) {

    }

    @Override
    public void deletePost(PostDTO postDTO) throws PostException {

    }

    @Override
    public void likePost(PostDTO postDTO) {

    }

    @Override
    public void sharePost(PostDTO postDTO) {

    }

    @Override
    public List<PostDTO> getAllPosts() {
        return null;
    }

    @Override
    public PostDTO getPostById(long id) throws PostException {
        return null;
    }

    @Override
    public PostDTO getPostByContent(String content) {
        return null;
    }

    @Override
    public boolean postExists(String content) {
        return false;
    }

    @Override
    public Post internalGetPostByContent(String content) {
        return null;
    }
}
