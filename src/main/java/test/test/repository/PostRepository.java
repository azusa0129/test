package test.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import test.test.entity.Post;

public interface PostRepository extends JpaRepository<Post, Long> {
}