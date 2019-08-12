/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employees.test;

import employees.dao.EmployeeDao;
import employees.dao.EmployeeDaoJDBC;
import employees.dto.EmployeeDTO;
import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author almis
 */
public class LaboratorioFinalJDBC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//utilizamos la interface como referencia a una clase concreta
        EmployeeDao employeeDao = new EmployeeDaoJDBC();
        
        //creamos un nuevo registro, hacemos uso de la clase PersonaDTO
        //que se encargará de transportar los datos asociados a la persona
        //no hace falta asignar el id ya que en a BD está cofigurado para
        //que se autogenere
        
        /*EmployeeDTO employeeDTO = new EmployeeDTO();
        employeeDTO.setFirstName("Diego");
        employeeDTO.setLastName("Scifo");
        employeeDTO.setEmail("diegoscifo@yahoo.com.ar");
        employeeDTO.setPhoneNumber("0263154571423");
        employeeDTO.setHireDate(new Date(System.currentTimeMillis()));
        employeeDTO.setJobId("PU_CLERK");
        employeeDTO.setSalary(34000.0);
        employeeDTO.setCommissionPct(0.2);
        employeeDTO.setManagerId(114);
        employeeDTO.setDepartmentId(30);*/
        
        //utilizamos la capa DAO para persistir el contenido del DTO
        try {
            //insertamos un registro
            //employeeDao.insert(employeeDTO);
            
            //eliminamos un registro
            /*EmployeeDTO empleadoAEliminar = new EmployeeDTO();
            empleadoAEliminar.setEmployeeId(226);
            employeeDao.delete(empleadoAEliminar);*/
            
            //actualizamos un registro
            /*EmployeeDTO empleadoAActualizar = new EmployeeDTO();
            empleadoAActualizar.setEmployeeId(226);
            empleadoAActualizar.setFirstName("Diego David");
            empleadoAActualizar.setLastName("Scifo");
            empleadoAActualizar.setEmail("diegoscifo@yahoo.com.ar");
            empleadoAActualizar.setPhoneNumber("0263154571423");
            empleadoAActualizar.setHireDate(new Date(System.currentTimeMillis()));
            empleadoAActualizar.setJobId("PU_CLERK");
            empleadoAActualizar.setSalary(34000.0);
            empleadoAActualizar.setCommissionPct(0.2);
            empleadoAActualizar.setManagerId(114);
            empleadoAActualizar.setDepartmentId(30);
            employeeDao.update(empleadoAActualizar);*/
            
            //mostramos los registros almacenados en BD
            List<EmployeeDTO> empleados = employeeDao.select();
            for(EmployeeDTO empleado : empleados) {
                System.out.println(empleado);
            }
            
        } catch (SQLException sqle) {
            System.out.println("Excepción en la capa de prueba");
            sqle.printStackTrace();
        }    }
    
}
