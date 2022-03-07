package dev.bong.jpa.repository;

import dev.bong.jpa.entity.BoardEntity;
import org.springframework.data.repository.CrudRepository;

public interface BoardRepository extends CrudRepository<BoardEntity, Long> {
}
