package firsov.study.springData.service;

import firsov.study.springData.model.Employee;
import firsov.study.springData.repository.EmployeeDescriptionRepo;
import firsov.study.springData.repository.EmployeeRepo;
import firsov.study.springData.repository.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
