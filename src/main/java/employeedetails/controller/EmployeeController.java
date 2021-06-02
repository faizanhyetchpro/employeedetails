package employeedetails.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import employeedetails.model.Employee;
import employeedetails.service.EmployeeService;

@Controller
public class EmployeeController {
    
    @Autowired
    private EmployeeService employeeService;
    
    
    @RequestMapping(path ="/save",method=RequestMethod.POST)
    public String saveEmployee(@ModelAttribute Employee emp){
      System.out.println("inside the Employee Controller");
      System.out.println("emp name :"+emp.getEmpName());
      this.employeeService.saveEmp(emp);
    return "success"; 
    }

}
