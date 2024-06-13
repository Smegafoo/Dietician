package SmegafooProject.dieticianDatabase.entities.concretes;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Table(name="employees")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Employee {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="name")
    private String name;

    @Column(name="birthDate")
    private String birthDate;

    @Column(name="email")
    private String email;

    @Column(name="gender")
    private String gender;

    @Column(name="password")
    private String password;

    @Column(name = "salary")
    private int salary;

    @OneToMany
    private List<Customer> customers;

    @OneToMany
    private List<Appointment> appointments;




}
