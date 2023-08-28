package java.springfirstapplication.Repository;

import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.springfirstapplication.Entity.Cement;

@Repository
public interface CementRepository extends JpaRepository<Cement, Long> {
}
