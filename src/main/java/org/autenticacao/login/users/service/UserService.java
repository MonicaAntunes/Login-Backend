package org.autenticacao.login.users.service;

import org.autenticacao.login.users.exceptions.UserAlreadyExistException;
import org.autenticacao.login.users.exceptions.UserNotFoundException;
import org.autenticacao.login.users.repository.UserRepositoryInterface;
import org.autenticacao.login.users.user.User;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private final UserRepositoryInterface userRepository;

    public UserService(UserRepositoryInterface userRepository) {
        this.userRepository = userRepository;
    }

    public Optional<User> findUser(Long id) {
        return userRepository.findById(id);
    }

    public List<User> listAllUsers() {
        return userRepository.findAll();
    }

    public void createUser(User user) throws UserAlreadyExistException {
        User foundUser = userRepository.findById(user.getId()).orElseThrow();

        if (user.equals(foundUser)) {
            throw new UserAlreadyExistException();
        } else {
            userRepository.save(user);
        }
    }

    public void updateUser(User user) {
        userRepository.save(user);
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
