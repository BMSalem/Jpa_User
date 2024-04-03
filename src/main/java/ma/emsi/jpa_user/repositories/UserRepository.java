package ma.emsi.jpa_user.repositories;

import ma.emsi.jpa_user.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,String> {
    User findByUsername(String userName);
}
