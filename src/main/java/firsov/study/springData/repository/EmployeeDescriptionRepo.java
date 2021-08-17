package firsov.study.springData.repository;

import firsov.study.springData.model.EmployeeDescription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeDescriptionRepo extends JpaRepository<EmployeeDescription, Long> {
}
