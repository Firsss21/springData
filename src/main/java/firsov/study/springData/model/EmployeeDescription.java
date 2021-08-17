package firsov.study.springData.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class EmployeeDescription {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @OneToOne(mappedBy = "description")
    @JoinColumn(name = "employee_id")
    Employee employee;

    String description;
}
