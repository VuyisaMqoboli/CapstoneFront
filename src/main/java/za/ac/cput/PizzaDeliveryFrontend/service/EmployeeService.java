package za.ac.cput.PizzaDeliveryFrontend.service;

import org.springframework.stereotype.Service;
import za.ac.cput.PizzaDeliveryFrontend.domain.Customer;
import za.ac.cput.PizzaDeliveryFrontend.domain.Employee;
import za.ac.cput.PizzaDeliveryFrontend.domain.OrderLine;

import java.util.ArrayList;
import java.util.Set;

/* EmployeeService.java
 Author: Dawood Kamalie (220147760)
 Date: 11th June (last updated) 2023
*/
@Service
public interface EmployeeService extends za.ac.cput.PizzaDeliveryFrontend.service.IService<Employee, String> {
    Employee create(Employee employee);
    Employee read(String empId);
    Employee update(Employee employee);
    boolean delete(String empId);

    Set<Employee> getAll();
}
