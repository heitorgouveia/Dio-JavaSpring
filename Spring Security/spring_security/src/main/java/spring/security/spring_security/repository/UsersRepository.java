package spring.security.spring_security.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import spring.security.spring_security.model.User;

public interface UsersRepository extends JpaRepository<User, Integer>{
    @Query("SELECT e FROM User e JOIN FETCH e.roles WHERE e.username = (:username)")
    public List<User> findByUsername(@Param("username") String username);
}

