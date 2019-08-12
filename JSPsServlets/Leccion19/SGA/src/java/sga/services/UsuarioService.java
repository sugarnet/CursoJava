package sga.services;

import java.util.List;
import sga.eis.dto.Usuario;

/**
 *
 * @author Ubaldo
 */
public interface UsuarioService {

    public boolean usuarioExistente(Usuario usuario);

    public List<Usuario> getAllUsuarios();

    public Usuario getUsuarioById(Integer idUsuario);

    public boolean eliminarUsuarios(List<Integer> idUsuarios);

    public boolean guardarUsuario(Usuario usuario);
}
