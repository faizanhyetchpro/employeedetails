package employeedetails.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import employeedetails.dao.EmployeeDao;
import employeedetails.model.Employee;
import employeedetails.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    
    @Autowired
    private EmployeeDao employeeDao;

    public void saveEmp(Employee emp) {
        
        this.employeeDao.saveEmp(emp);
    }

}
