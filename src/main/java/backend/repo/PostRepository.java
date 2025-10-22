package backend.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import backend.entity.Post;

public interface PostRepository extends JpaRepository<Post, Long> {}
