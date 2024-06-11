package org.example.springboot3.web.dto;

import lombok.Builder;

/**
 * packageName    : org.example.springboot3.web.dto
 * fileName       : PostsUpdateRequestDto
 * author         : Yeong-Huns
 * date           : 2024-06-11
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-06-11        Yeong-Huns       최초 생성
 */
@Builder
public record PostsUpdateRequestDto(String title, String content) {


}
