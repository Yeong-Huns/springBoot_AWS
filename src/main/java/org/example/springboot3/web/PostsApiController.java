package org.example.springboot3.web;

import lombok.RequiredArgsConstructor;
import org.example.springboot3.PostService;
import org.example.springboot3.web.dto.PostsSaveRequestDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * packageName    : org.example.springboot3.web
 * fileName       : PostsApiController
 * author         : Yeong-Huns
 * date           : 2024-06-10
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-06-10        Yeong-Huns       최초 생성
 */
@RequiredArgsConstructor
@RestController
public class PostsApiController {
    private final PostService postService;

    @PostMapping("/api/v1/posts")
    public Long save(@RequestBody PostsSaveRequestDto requestDto){
        return postService.save(requestDto);
    }
}
