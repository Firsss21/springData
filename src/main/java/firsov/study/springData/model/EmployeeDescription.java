package firsov.study.springData.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class EmployeeDescription {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "employee_id")
    Employee employee;

    String description;
}
