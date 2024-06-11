package org.example.springboot3;

import lombok.RequiredArgsConstructor;
import org.example.springboot3.domain.posts.Posts;
import org.example.springboot3.domain.posts.PostsRepository;
import org.example.springboot3.web.dto.PostsResponseDto;
import org.example.springboot3.web.dto.PostsSaveRequestDto;
import org.example.springboot3.web.dto.PostsUpdateRequestDto;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * packageName    : org.example.springboot3
 * fileName       : PostService
 * author         : Yeong-Huns
 * date           : 2024-06-10
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-06-10        Yeong-Huns       최초 생성
 */
@RequiredArgsConstructor
@Service
public class PostService {
    private final PostsRepository postsRepository;

    @Transactional
    public Long save(PostsSaveRequestDto requestDto){
        return postsRepository.save(requestDto.toEntity()).getId();
    }

    @Transactional
    public Long update(Long id,PostsUpdateRequestDto requestDto){
        Posts posts = postsRepository.findById(id).orElseThrow(()-> new IllegalArgumentException("해당 게시글이 없습니다. id : " + id));
        posts.update(requestDto.title(), requestDto.content());
        return id;
    }

    public PostsResponseDto findById(Long id){
        Posts posts = postsRepository.findById(id).orElseThrow(()-> new IllegalArgumentException("해당 게시글이 없습니다."));
        return PostsResponseDto.fromEntity(posts);
    }
}
