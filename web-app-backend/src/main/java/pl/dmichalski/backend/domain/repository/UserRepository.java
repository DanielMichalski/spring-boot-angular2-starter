package pl.dmichalski.backend.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.dmichalski.backend.domain.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
