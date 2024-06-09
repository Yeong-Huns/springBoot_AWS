package org.example.springboot3.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * packageName    : org.example.springboot3.domain.posts
 * fileName       : PostsRepository
 * author         : Yeong-Huns
 * date           : 2024-06-10
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-06-10        Yeong-Huns       최초 생성
 */
@Repository
public interface PostsRepository extends JpaRepository<Posts, Long> {
}
