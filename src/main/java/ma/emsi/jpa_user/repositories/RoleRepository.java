package ma.emsi.jpa_user.repositories;

import ma.emsi.jpa_user.entities.Role;
import ma.emsi.jpa_user.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // Annontation qui montre Component de la couche DAO
public interface RoleRepository extends JpaRepository<Role,Long> {
    Role findByRoleName(String roleName);
}
