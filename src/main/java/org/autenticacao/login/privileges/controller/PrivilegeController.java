package org.autenticacao.login.privileges.controller;

import org.autenticacao.login.privileges.privilege.Privilege;
import org.autenticacao.login.privileges.service.PrivilegeService;
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
@RequestMapping("/privileges")
public class PrivilegeController {
    private final PrivilegeService privilegeService;

    public PrivilegeController(PrivilegeService privilegeService) {
        this.privilegeService = privilegeService;
    }

    @GetMapping("/{id}")
    public Optional<Privilege> findById(@PathVariable Long id) {
        return privilegeService.findRole(id);
    }

    @GetMapping
    public List<Privilege> findAll() {
        return privilegeService.listAllRoles();
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public void createUser(@RequestBody Privilege privilege) {
        privilegeService.createRole(privilege);
    }

    @PutMapping
    public void updateUser(@RequestBody Privilege privilege) {
        privilegeService.updateRole(privilege);
    }

    @DeleteMapping
    public void deleteUser(Long id) {
        privilegeService.deleteRole(id);
    }

}
