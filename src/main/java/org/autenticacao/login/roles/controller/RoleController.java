package org.autenticacao.login.roles.controller;

import org.autenticacao.login.roles.role.Role;
import org.autenticacao.login.roles.service.RoleService;
import org.autenticacao.login.users.user.User;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/roles")
public class RoleController {
    private final RoleService roleService;

    public RoleController(RoleService roleService) {
        this.roleService = roleService;
    }

    @GetMapping("/{id}")
    public Optional<Role> findById(@PathVariable Long id) {
        return roleService.findRole(id);
    }

    @GetMapping
    public List<Role> findAll() {
        return roleService.listAllRoles();
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public void createUser(@RequestBody Role role) {
        roleService.createRole(role);
    }

    @PutMapping
    public void updateUser(@RequestBody Role role) {
        roleService.updateRole(role);
    }

    @DeleteMapping
    public void deleteUser(Long id) {
        roleService.deleteRole(id);
    }
}
