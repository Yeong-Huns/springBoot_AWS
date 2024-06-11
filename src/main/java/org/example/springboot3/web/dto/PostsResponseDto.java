package org.example.springboot3.web.dto;

import lombok.Builder;
import org.example.springboot3.domain.posts.Posts;

/**
 * packageName    : org.example.springboot3.web.dto
 * fileName       : PostsResponseDto
 * author         : Yeong-Huns
 * date           : 2024-06-11
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-06-11        Yeong-Huns       최초 생성
 */
@Builder
public record PostsResponseDto(Long id, String title, String content, String author) {

    public static PostsResponseDto fromEntity(Posts entity){
        return PostsResponseDto.builder()
                .id(entity.getId())
                .title(entity.getTitle())
                .content(entity.getContent())
                .author(entity.getAuthor())
                .build();
    }
}
