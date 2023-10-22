package pooja.com.example.UserApplication.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pooja.com.example.UserApplication.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail (String email);
}
