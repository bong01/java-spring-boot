package dev.bong.mybatis.mapper;

import dev.bong.mybatis.dto.PostDto;

import java.util.List;

public interface PostMapper {
    int createPost(PostDto dto); //row 개수 반환

    int createPostAll(List<PostDto> dtoList);

    PostDto readPost(int id);

    List<PostDto> readPostAll();

    PostDto readPostQuery(PostDto dto);

    int updatePost(PostDto dto);

    int deletePost(int id);
}
