/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employees.dao;

import employees.dto.EmployeeDTO;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author almis
 */
public interface EmployeeDao {
    public Integer insert(EmployeeDTO employeeDTO) throws SQLException;
    public Integer update(EmployeeDTO employeeDTO) throws SQLException;
    public Integer delete(EmployeeDTO employeeDTO) throws SQLException;
    public List<EmployeeDTO> select() throws SQLException;
    public Connection getConnection() throws SQLException;
}
