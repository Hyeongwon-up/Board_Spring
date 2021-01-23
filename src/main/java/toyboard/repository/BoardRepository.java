package toyboard.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import toyboard.domain.entity.BoardEntity;

public interface BoardRepository extends JpaRepository<BoardEntity, Long> {

}
