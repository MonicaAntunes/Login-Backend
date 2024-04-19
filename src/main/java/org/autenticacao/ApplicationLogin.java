package org.autenticacao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApplicationLogin {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationLogin.class, args);
        System.out.println("OK!");
    }
}