package controller;

import model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.EmployeeService;

import java.util.List;

/**
 * Created by Ali on 12/4/2016.
 */
@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("{id}")
    public Employee getEmployeeByID(@PathVariable("id") String id){
        return employeeService.getEmployeeById(Integer.parseInt(id));
    }

    @RequestMapping("/all")
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }
}
