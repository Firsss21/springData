package firsov.study.springData.repository;

import firsov.study.springData.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long> {

    @Override
    Optional<Employee> findById(Long aLong);

    Optional<Employee> findByFirstName(String name);

    @Query("SELECT e FROM Employee e WHERE e.firstName LIKE 'firsss'")
    @Transactional(readOnly = true)
    List<Employee> findAllNamedFirsss();
}
