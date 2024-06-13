package SmegafooProject.dieticianDatabase.dataAcces.abstracts;

import SmegafooProject.dieticianDatabase.entities.concretes.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository <Customer,Integer> {

}
