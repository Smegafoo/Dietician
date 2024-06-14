package SmegafooProject.dieticianDatabase.entities.concretes;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Table(name = "Diets")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Diet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "content")
    private String content;

    @Column(name = "StartDate")
    private String startDate;

    @Column(name = "endDate")
    private String endDate;

    @OneToMany
    @JoinColumn(name = "customer id")
    private List<Customer> customers;



}
