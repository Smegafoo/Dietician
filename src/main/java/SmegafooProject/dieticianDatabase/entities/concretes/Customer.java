package SmegafooProject.dieticianDatabase.entities.concretes;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Table(name = "customers")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "subscriptionDate ")
    private String subsDate;

    @Column(name = "email")
    private String email;

    @Column(name = "phoneNumber")
    private String phone;

    @ManyToOne
    private Employee employee;

    @ManyToOne
    private Diet diet;

    @OneToMany
    private List<Appointment> appointments;

    @OneToMany
    private List<Payment> payments;


}
