package org.example.springboot3.web;

import lombok.RequiredArgsConstructor;
import org.example.springboot3.PostService;
import org.example.springboot3.web.dto.PostsResponseDto;
import org.example.springboot3.web.dto.PostsSaveRequestDto;
import org.example.springboot3.web.dto.PostsUpdateRequestDto;
import org.springframework.web.bind.annotation.*;

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

    @PutMapping("/api/v1/posts/{id}")
    public Long update(@PathVariable Long id, @RequestBody PostsUpdateRequestDto requestDto){
        return postService.update(id, requestDto);
    }

    @GetMapping("/api/v1/posts/{id}")
    public PostsResponseDto findById(@PathVariable Long id){
        return postService.findById(id);
    }

}
