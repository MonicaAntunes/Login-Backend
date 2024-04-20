package org.autenticacao.login.roles.repository;

import org.autenticacao.login.roles.role.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepositoryInterface extends JpaRepository<Role, Long> {
}
