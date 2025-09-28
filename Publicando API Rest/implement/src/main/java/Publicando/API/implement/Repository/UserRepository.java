package Publicando.API.implement.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Publicando.API.implement.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

    
}
