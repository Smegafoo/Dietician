package SmegafooProject.dieticianDatabase.business.abstracts;

import SmegafooProject.dieticianDatabase.entities.concretes.Customer;

import java.util.List;

public interface CustomerService {

    public List<Customer> getAll();
}
