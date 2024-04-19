package org.autenticacao.login.users.exceptions;

public class UserAlreadyExistException extends Exception {
    @Override
    public String getMessage() {
        return "Can't register an user that already exist.";
    }
}
