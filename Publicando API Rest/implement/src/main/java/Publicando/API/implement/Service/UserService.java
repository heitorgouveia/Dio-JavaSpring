package Publicando.API.implement.Service;

import Publicando.API.implement.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);

}
