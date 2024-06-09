package org.example.springboot3.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * packageName    : org.example.springboot3.web.dto
 * fileName       : HelloResponseDto
 * author         : Yeong-Huns
 * date           : 2024-06-09
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-06-09        Yeong-Huns       최초 생성
 */
@Getter
@RequiredArgsConstructor
public class HelloResponseDto {
    private final String name;
    private final int amount;
}
