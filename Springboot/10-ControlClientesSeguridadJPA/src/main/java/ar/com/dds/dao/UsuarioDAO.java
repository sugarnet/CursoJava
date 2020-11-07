package ar.com.dds.dao;

import ar.com.dds.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioDAO extends JpaRepository<Usuario, Long>{
    Usuario findByUsername(String username);
}