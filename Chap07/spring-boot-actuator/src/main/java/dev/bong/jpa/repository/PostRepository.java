package dev.bong.jpa.repository;

import dev.bong.jpa.entity.PostEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PostRepository extends CrudRepository<PostEntity, Long> {
    List<PostEntity> findAllByWriter(String writer); //where writer = ?

    List<PostEntity> findAllByWriterContaining(String writer);
}
