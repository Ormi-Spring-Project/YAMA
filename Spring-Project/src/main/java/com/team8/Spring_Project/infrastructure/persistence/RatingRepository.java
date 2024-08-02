package com.team8.Spring_Project.infrastructure.persistence;

import com.team8.Spring_Project.domain.Comment;
import com.team8.Spring_Project.domain.Post;
import com.team8.Spring_Project.domain.Rating;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RatingRepository extends JpaRepository<Rating, Long> {
    // 게시글의 평균 별점 조회
    Optional<Double> findAverageValueByPost(Post post);

    // 댓글의 별점 조회
    Optional<Rating> findByComment(Comment comment);
}