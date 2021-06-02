package employeedetails.daoImpl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import employeedetails.dao.EmployeeDao;
import employeedetails.model.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao{
    
    @Autowired
    private HibernateTemplate hibernateTemplate;
    
    @Transactional
    public void saveEmp(Employee emp) {
        
        this.hibernateTemplate.save(emp);
        
        
    }

}
