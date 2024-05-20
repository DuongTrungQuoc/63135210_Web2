package thiGK.ntu63135210.dtquoc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import thiGK.ntu63135210.dtquoc.model.HangHoa;
@Repository
public interface HangHoaRepository extends JpaRepository<HangHoa, Integer> {
}
