package firsov.study.springData.controller;

import firsov.study.springData.model.Employee;
import firsov.study.springData.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee/")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping
    public List<Employee> getAll() {
        return employeeService.getAll();
    }

    @PostMapping
    public void createEmployee(@RequestParam("firstName") String firstName, @RequestParam("lastName") String lastName, @RequestParam("city") String city) {
        Employee employee = new Employee();
        employee.setFirstName(firstName);
        employee.setLastName(lastName);
        employee.setCity(city);
        employeeService.save(employee);
    }

    @GetMapping("/{id}")
    public Employee getById(@PathVariable Long id) {
        return employeeService.getById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        employeeService.delById(id);
    }


//    ----------

    @PutMapping("/firsss")
    public Integer updFirsss() {
        return employeeService.updFirsss();
    }

    @GetMapping("/firsss")
    public List<Employee> getFirsss() {
        return employeeService.getFirsss();
    }

}
