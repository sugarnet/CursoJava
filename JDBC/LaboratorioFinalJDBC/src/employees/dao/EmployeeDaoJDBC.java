/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employees.dao;

import employees.dto.EmployeeDTO;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import jdbc.Conexion;

/**
 *
 * @author almis
 */
public class EmployeeDaoJDBC implements EmployeeDao{

    private static final String SQL_INSERT = "INSERT INTO employees "
            + "(employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,commission_pct,manager_id,department_id) "
            + "VALUES "
            + "(EMPLOYEES_SEQ.NEXTVAL, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    private static final String SQL_UPDATE = "UPDATE employees SET "
            + "first_name=?,last_name=?,email=?,phone_number=?,hire_date=?,job_id=?,salary=?,commission_pct=?,manager_id=?,department_id=? "
            + "WHERE employee_id=?";
    private static final String SQL_DELETE = "DELETE FROM employees WHERE employee_id=?";
    private static final String SQL_SELECT = "SELECT "
            + "employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,commission_pct,manager_id,department_id "
            + "FROM employees ORDER BY employee_id";

   
    @Override
    public Integer insert(EmployeeDTO employeeDTO) throws SQLException {
        Connection localConnection = null;
        PreparedStatement preparedStatement = null;
        
        int rows = 0;
        
        try {
            localConnection = getConnection();
            preparedStatement = localConnection.prepareStatement(SQL_INSERT);
            
            int index = 1;
            
            preparedStatement.setString(index++, employeeDTO.getFirstName());
            preparedStatement.setString(index++, employeeDTO.getLastName());
            preparedStatement.setString(index++, employeeDTO.getEmail());
            preparedStatement.setString(index++, employeeDTO.getPhoneNumber());
            preparedStatement.setDate(index++, employeeDTO.getHireDate());
            preparedStatement.setString(index++, employeeDTO.getJobId());
            preparedStatement.setDouble(index++, employeeDTO.getSalary());
            preparedStatement.setDouble(index++, employeeDTO.getCommissionPct());
            preparedStatement.setInt(index++, employeeDTO.getManagerId());
            preparedStatement.setInt(index++, employeeDTO.getDepartmentId());
            
            System.out.println("Ejecutando query: " + SQL_INSERT);
            rows = preparedStatement.executeUpdate();
            System.out.println("Registros afectados: " + rows);
        
        } finally {
            localConnection.close();
        }
        
        return rows;
    }

    @Override
    public Integer update(EmployeeDTO employeeDTO) throws SQLException {
        Connection localConnection = null;
        PreparedStatement preparedStatement = null;
        
        int rows = 0;
        
        try {
            localConnection = getConnection();
            preparedStatement = localConnection.prepareStatement(SQL_UPDATE);
            
            int index = 1;            
            
            preparedStatement.setString(index++, employeeDTO.getFirstName());
            preparedStatement.setString(index++, employeeDTO.getLastName());
            preparedStatement.setString(index++, employeeDTO.getEmail());
            preparedStatement.setString(index++, employeeDTO.getPhoneNumber());
            preparedStatement.setDate(index++, employeeDTO.getHireDate());
            preparedStatement.setString(index++, employeeDTO.getJobId());
            preparedStatement.setDouble(index++, employeeDTO.getSalary());
            preparedStatement.setDouble(index++, employeeDTO.getCommissionPct());
            preparedStatement.setInt(index++, employeeDTO.getManagerId());
            preparedStatement.setInt(index++, employeeDTO.getDepartmentId());
            preparedStatement.setInt(index++, employeeDTO.getEmployeeId());
            
            System.out.println("Ejecutando query: " + SQL_UPDATE);
            rows = preparedStatement.executeUpdate();
            System.out.println("Registros afectados: " + rows);
        
        } finally {
            localConnection.close();
        }
        
        return rows;
    }

    @Override
    public Integer delete(EmployeeDTO employeeDTO) throws SQLException {
        Connection localConnection = null;
        PreparedStatement preparedStatement = null;
        
        int rows = 0;
        
        try {
            localConnection = getConnection();
            preparedStatement = localConnection.prepareStatement(SQL_DELETE);
            
            int index = 1;            
            
            preparedStatement.setInt(index++, employeeDTO.getEmployeeId());
            
            System.out.println("Ejecutando query: " + SQL_DELETE);
            rows = preparedStatement.executeUpdate();
            System.out.println("Registros afectados: " + rows);
        
        } finally {
            localConnection.close();
        }
        
        return rows;
    }

    @Override
    public List<EmployeeDTO> select() throws SQLException {
        Connection localConnection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        EmployeeDTO employee = null;
        List<EmployeeDTO> employees = new ArrayList<>();
        
        try {
            localConnection = getConnection();
            preparedStatement = localConnection.prepareStatement(SQL_SELECT);
            resultSet = preparedStatement.executeQuery();
            
            while(resultSet.next()) {
                Integer employeeId = resultSet.getInt("employee_id");
                String firstName = resultSet.getString("first_name");
                String lastName = resultSet.getString("last_name");
                String email = resultSet.getString("email");
                String phoneNumber = resultSet.getString("phone_number");
                Date hireDate = resultSet.getDate("hire_date");
                String jobId = resultSet.getString("job_id");
                Double salary = resultSet.getDouble("salary");
                Double commissionPct = resultSet.getDouble("commission_pct");
                Integer managerId = resultSet.getInt("manager_id");
                Integer departmentId = resultSet.getInt("department_id");
                
                employee = new EmployeeDTO();
                employee.setEmployeeId(employeeId);
                employee.setFirstName(firstName);
                employee.setLastName(lastName);
                employee.setEmail(email);
                employee.setPhoneNumber(phoneNumber);
                employee.setHireDate(hireDate);
                employee.setJobId(jobId);
                employee.setSalary(salary);
                employee.setCommissionPct(commissionPct);
                employee.setManagerId(managerId);
                employee.setDepartmentId(departmentId);
                
                employees.add(employee);
            }
        
        } finally {
            
            localConnection.close();
        }
        
        return employees;
    }

    @Override
    public Connection getConnection() throws SQLException {
        return Conexion.getConnection();    
    }
    
}
