package org.autenticacao.login.users.service;

import org.autenticacao.login.users.exceptions.UserAlreadyExistException;
import org.autenticacao.login.users.repository.UserRepositoryInterface;
import org.autenticacao.login.users.user.User;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.when;

public class UserServiceTest {

    @Mock
    private final UserRepositoryInterface userRepositoryInterface;

    @InjectMocks
    private final UserService userService;

    public UserServiceTest(UserRepositoryInterface userRepositoryInterface, UserService userService) {
        this.userRepositoryInterface = userRepositoryInterface;
        this.userService = userService;
    }

    @Test
    void shouldCreateAnUserOnDataBaseWhenTryToRegisterANewUser() {
        //criar um login cenário de sucesso
        //quando não houver dado repetido cria um novo
        //assertEquals();
    }

//    @Test
//    void shouldThrowAnExceptionWhenTryToRegisterAnUserOnDataBaseAndUserAlreadyExist() {
//        final User registeredUser = new User(1L, "MonicaAntunes", "1234",
//                "1234", true, false);
//
//        when(userRepositoryInterface.findById(1L)).thenReturn(Optional.of(registeredUser));
//
//        assertThrows(UserAlreadyExistException.class, () ->
//                userService.createUser(registeredUser)
//        );
//    }

    @Test
    void shouldListAll() {
        //
    }

    @Test
    void shouldListOne() {
        //
    }

    @Test
    void shouldUpdate() {
        //
    }

    @Test
    void shouldDeleteOne() {
        //
    }

}
