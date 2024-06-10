package org.example.springboot3.web.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.example.springboot3.domain.posts.Posts;

/**
 * packageName    : org.example.springboot3.web.dto
 * fileName       : PostsSaveRequestDto
 * author         : Yeong-Huns
 * date           : 2024-06-10
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-06-10        Yeong-Huns       최초 생성
 */
@Builder
public record PostsSaveRequestDto(String title, String content, String author) {
    public Posts toEntity(){
        return Posts.builder()
                .title(title)
                .content(content)
                .author(author)
                .build();
    }
}
