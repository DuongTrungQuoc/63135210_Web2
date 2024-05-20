package thiGK.ntu63135210.dtquoc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import thiGK.ntu63135210.dtquoc.model.ChatLieu;

@Repository
public interface ChatLieuRepository extends JpaRepository<ChatLieu, Integer> {
}
