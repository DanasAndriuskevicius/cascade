package lt.codeacademy.javau8.cascade.repositories;

import lt.codeacademy.javau8.cascade.entities.Egzaminas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EgzaminasRepository extends JpaRepository<Egzaminas, Long> {
}
