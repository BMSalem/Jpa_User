package ma.emsi.jpa_user.service;

import ma.emsi.jpa_user.entities.Role;
import ma.emsi.jpa_user.entities.User;

public interface UserService {
    User addNewUser(User user);
    Role addNewRole(Role role);
    User findUserByUserName(String userName);
    Role findRoleByRoleName(String roleName);
    void addRoleToUser(String username, String roleName);

    User authenticate(String userName, String password);
}
