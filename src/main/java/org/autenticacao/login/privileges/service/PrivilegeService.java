package org.autenticacao.login.privileges.service;

import org.autenticacao.login.privileges.privilege.Privilege;
import org.autenticacao.login.privileges.repository.PrivilegeRepositoryInterface;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class PrivilegeService {
    private final PrivilegeRepositoryInterface privilegeRepositoryInterface;

    public PrivilegeService(PrivilegeRepositoryInterface privilegeRepositoryInterface) {
        this.privilegeRepositoryInterface = privilegeRepositoryInterface;
    }

    public Optional<Privilege> findRole(Long id) {
        return privilegeRepositoryInterface.findById(id);
    }

    public List<Privilege> listAllRoles() {
        return privilegeRepositoryInterface.findAll();
    }

    public void createRole(Privilege privilege) {
        privilegeRepositoryInterface.save(privilege);
    }

    public void updateRole(Privilege privilege) {
        privilegeRepositoryInterface.save(privilege);
    }

    public void deleteRole(Long id) {
        privilegeRepositoryInterface.deleteById(id);
    }
}
