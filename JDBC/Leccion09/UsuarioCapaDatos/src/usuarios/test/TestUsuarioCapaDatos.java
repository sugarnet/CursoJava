/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usuarios.test;

import java.sql.SQLException;
import java.util.List;
import usuarios.dto.UsuarioDTO;
import usuarios.jdbc.UsuarioDaoJDBC;
import usuarios.jdbc.UsuarioDao;

/**
 *
 * @author almis
 */
public class TestUsuarioCapaDatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //utilizamos la interface como referencia a una clase concreta
        UsuarioDao personaDao = new UsuarioDaoJDBC();
        
        //creamos un nuevo registro, hacemos uso de la clase UsuarioDTO
        //que se encargará de transportar los datos asociados a la persona
        //no hace falta asignar el id ya que en a BD está cofigurado para
        //que se autogenere
        
        UsuarioDTO personaDTO = new UsuarioDTO();
        personaDTO.setUsuario("dscifo");
        personaDTO.setPassword("123456");
        
        //utilizamos la capa DAO para persistir el contenido del DTO
        try {
            //insertamos un registro
            personaDao.insert(personaDTO);
            
            //eliminamos un registro
            UsuarioDTO usuarioAEliminar = new UsuarioDTO();
            usuarioAEliminar.setIdUsuario(4);
            personaDao.delete(usuarioAEliminar);
            
            //actualizamos un registro
            UsuarioDTO usuarioARefrescar = new UsuarioDTO();
            usuarioARefrescar.setIdUsuario(2);
            usuarioARefrescar.setUsuario("Pepe");
            usuarioARefrescar.setPassword("Sanchez");   
            personaDao.update(usuarioARefrescar);
            
            //mostramos los registros almacenados en BD
            List<UsuarioDTO> usuarios = personaDao.select();
            
            usuarios.stream().forEach(usuario -> System.out.println(usuario));
            
            /* for (UsuarioDTO usuario : usuarios) {
                System.out.println(usuario);
            }*/
            
        } catch (SQLException sqle) {
            System.out.println("Excepción en la capa de prueba");
            sqle.printStackTrace();
        }
    }
    
}
