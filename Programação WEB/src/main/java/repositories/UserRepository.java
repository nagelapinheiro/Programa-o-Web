// src/main/java/repositories/UserRepository.java

package repositories;

import java.util.List;

public interface UserRepository<User> extends JpaRepository<User, Long> {

	List<entities.User> findAll();
}
