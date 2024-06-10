package org.example.springboot3.web;

import org.example.springboot3.domain.posts.Posts;
import org.example.springboot3.domain.posts.PostsRepository;
import org.example.springboot3.web.dto.PostsSaveRequestDto;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


/**
 * packageName    : org.example.springboot3.web
 * fileName       : PostsApiControllerTest
 * author         : Yeong-Huns
 * date           : 2024-06-10
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-06-10        Yeong-Huns       최초 생성
 */
@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class PostsApiControllerTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Autowired
    private PostsRepository postsRepository;

    @AfterEach
    public void tearDown() throws Exception {
        postsRepository.deleteAll();
    }

    @Test
    @DisplayName("Posts가_등록된다.")
    void save() throws Exception {
        //given
        String title = "title";
        String content = "content";
        PostsSaveRequestDto requestDto =
                PostsSaveRequestDto.builder()
                        .title(title)
                        .content(content)
                        .author("author")
                        .build();
        String url = "http://localhost:" + port + "/api/v1/posts";

        //when
        ResponseEntity<Long> responseEntity = restTemplate.postForEntity(url, requestDto, Long.class);

        //then
        assertThat(responseEntity.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(responseEntity.getBody()).isGreaterThan(0L);
        List<Posts> all = postsRepository.findAll();
        assertThat(all.getFirst().getTitle()).isEqualTo(title);
        assertThat(all.getFirst().getContent()).isEqualTo(content);

    }
}