package org.autenticacao.login.roles.service;

import org.autenticacao.login.roles.repository.RoleRepositoryInterface;
import org.autenticacao.login.roles.role.Role;
import org.autenticacao.login.users.user.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoleService {
    private final RoleRepositoryInterface roleRepositoryInterface;

    public RoleService(RoleRepositoryInterface roleRepositoryInterface) {
        this.roleRepositoryInterface = roleRepositoryInterface;
    }

    public Optional<Role> findRole(Long id) {
        return roleRepositoryInterface.findById(id);
    }

    public List<Role> listAllRoles() {
        return roleRepositoryInterface.findAll();
    }

    public void createRole(Role role) {
        roleRepositoryInterface.save(role);
    }

    public void updateRole(Role role) {
        roleRepositoryInterface.save(role);
    }

    public void deleteRole(Long id) {
        roleRepositoryInterface.deleteById(id);
    }
}
