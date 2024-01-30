package lt.codeacademy.javau8.cascade.repositories;

import lt.codeacademy.javau8.cascade.entities.Kursas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KursasRepository extends JpaRepository<Kursas, Long> {
}
