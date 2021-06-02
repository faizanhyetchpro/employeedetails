package employeedetails.dao;

import org.springframework.stereotype.Repository;

import employeedetails.model.Employee;

@Repository
public interface EmployeeDao {
    
    public void saveEmp(Employee emp);

}
