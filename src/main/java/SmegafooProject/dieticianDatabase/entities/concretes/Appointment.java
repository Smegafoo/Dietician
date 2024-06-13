package SmegafooProject.dieticianDatabase.entities.concretes;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "appointments")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String date;

    @Column(name = "duration")
    private String duration;

    @Column(name = "status")
    private String status;

    @ManyToOne
    private Customer customer;

    @ManyToOne
    private Employee employee;


}
