package firsov.study.springData.model;

import lombok.Data;
import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String firstName;

    private String lastName;

    private String city;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Todo> todos;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "description_id")
    private EmployeeDescription employeeDescription;

}
