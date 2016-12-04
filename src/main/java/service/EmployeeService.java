package service;

import model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Ali on 12/4/2016.
 */

@Service
public class EmployeeService {

    Hashtable<Integer, Employee> map = new Hashtable<>();

    public EmployeeService() {
        Employee e1 = new Employee();
        e1.setId(1);
        e1.setName("paul");
        e1.setSalary(50000);

        Employee e2 = new Employee();
        e2.setId(2);
        e2.setName("john");
        e2.setSalary(51000);

        map.put(e1.getId(),e1);
        map.put(e2.getId(),e2);
    }

    public Employee getEmployeeById(int id) {
        return map.get(id);
    }

    public List<Employee> getAllEmployees() {
        List<Employee> list = new ArrayList<>();
        Iterator<Integer> it = map.keySet().iterator();
        while(it.hasNext()){
            list.add(map.get(it.next()));
        }
        return list;
    }
}
