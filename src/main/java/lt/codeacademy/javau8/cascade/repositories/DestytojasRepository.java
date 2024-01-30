package lt.codeacademy.javau8.cascade.repositories;

import lt.codeacademy.javau8.cascade.entities.Destytojas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DestytojasRepository extends JpaRepository<Destytojas, Long> {
}
