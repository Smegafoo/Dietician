package SmegafooProject.dieticianDatabase.entities.concretes;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "payments")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "method")
    private String method;

    @Column(name = "date")
    private String date;

    @Column(name = "amount")
    private int amount;

    @ManyToOne
    private Customer customer;


}
