package org.autenticacao.login.privileges.repository;

import org.autenticacao.login.privileges.privilege.Privilege;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrivilegeRepositoryInterface extends JpaRepository<Privilege, Long> {
}
