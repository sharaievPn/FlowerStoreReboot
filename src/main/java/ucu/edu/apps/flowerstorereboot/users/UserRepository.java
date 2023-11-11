package ucu.edu.apps.flowerstorereboot.users;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface UserRepository extends JpaRepository<AppUser, Integer> {
    @Query("SELECT u FROM AppUser u WHERE u.email = ?1")
    Optional<AppUser> findByEmail(String email);
}