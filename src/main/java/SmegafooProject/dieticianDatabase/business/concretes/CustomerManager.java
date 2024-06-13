package SmegafooProject.dieticianDatabase.business.concretes;

import SmegafooProject.dieticianDatabase.business.abstracts.CustomerService;
import SmegafooProject.dieticianDatabase.dataAcces.abstracts.CustomerRepository;
import SmegafooProject.dieticianDatabase.entities.concretes.Customer;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CustomerManager implements CustomerService {
    private CustomerRepository customerRepository;

    @Autowired
    public CustomerManager(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public List<Customer> getAll() {
        return customerRepository.findAll();
    }
}
