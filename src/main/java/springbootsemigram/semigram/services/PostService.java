package springbootsemigram.semigram.services;

import springbootsemigram.semigram.dtos.PostDTO;
import springbootsemigram.semigram.exceptions.PostException;
import springbootsemigram.semigram.models.Post;

import java.util.List;

public interface PostService {
    void createPost(PostDTO postDTO);
    void deletePost(PostDTO postDTO) throws PostException;
    void likePost(PostDTO postDTO);
    void sharePost(PostDTO postDTO);
    List<PostDTO> getAllPosts();
    PostDTO getPostById(long id) throws PostException;
    PostDTO getPostByContent(String content);
    boolean postExists(String content);
   // Post internalGetPostById(long id);
    Post internalGetPostByContent(String content);
}
