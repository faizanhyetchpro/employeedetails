package employeedetails.service;

import org.springframework.stereotype.Service;

import employeedetails.model.Employee;

@Service
public interface EmployeeService {
    
    public void saveEmp(Employee emp);

}
