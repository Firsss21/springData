package firsov.study.springData.service;

import firsov.study.springData.model.Employee;
import firsov.study.springData.repository.EmployeeDescriptionRepo;
import firsov.study.springData.repository.EmployeeRepo;
import firsov.study.springData.repository.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;


@Service
public class EmployeeService {
    @Autowired
    EmployeeRepo employeeRepo;
    @Autowired
    EmployeeDescriptionRepo employeeDescriptionRepo;
    @Autowired
    TodoRepo todoRepo;

    public List<Employee> getAll() {
        return employeeRepo.findAll();
    }

    public void save(Employee employee) {
        employeeRepo.save(employee);
    }

    public Employee getById(Long id) {
        return employeeRepo.getById(id);
    }

    public void delById(Long id) {
        employeeRepo.deleteById(id);
    }

    public Integer updFirsss() {
        return employeeRepo.updateFirsss();
    }

    public List<Employee> getFirsss() {
        return employeeRepo.findAllNamedFirsss();
    }

}
