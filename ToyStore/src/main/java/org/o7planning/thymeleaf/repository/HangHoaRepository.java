package org.o7planning.thymeleaf.repository;

import org.o7planning.thymeleaf.model.HangHoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HangHoaRepository extends JpaRepository<HangHoa, Integer> {
}
