package SmegafooProject.dieticianDatabase.business.abstracts;

import SmegafooProject.dieticianDatabase.business.response.GetAllCustomersResponse;
import SmegafooProject.dieticianDatabase.entities.concretes.Customer;

import java.util.List;

public interface CustomerService {

    public List<GetAllCustomersResponse> getAll();
}
