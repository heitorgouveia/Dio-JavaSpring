package spring.jwt.json_web_token.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;

import spring.jwt.json_web_token.model.User;


@EnableJpaRepositories
public interface UserRepository extends JpaRepository<User,Integer> {
    @Query("SELECT e FROM User e Join Fetch e.roles WHERE e.username = (:username)")
    public User findByUsername(@Param("username") String username);

    boolean existsByUsername (String username);


}
