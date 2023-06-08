package repository;

import entity.Role;
import entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.jar.Attributes;

public interface UserRepository extends JpaRepository<User,Long> {

    User getUserById(long id);

    User getUserByNickname(String nickname);

    User getUserByEmail(String email);

    List<Role> getUserByRole(Role role);



}
