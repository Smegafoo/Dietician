package SmegafooProject.dieticianDatabase.business.abstracts;

import SmegafooProject.dieticianDatabase.business.request.CreateCustomerRequest;
import SmegafooProject.dieticianDatabase.business.request.UpdateCustomerRequest;
import SmegafooProject.dieticianDatabase.business.response.GetAllCustomersResponse;
import SmegafooProject.dieticianDatabase.business.response.GetByIdCustomerResponse;
import SmegafooProject.dieticianDatabase.entities.concretes.Customer;

import java.util.List;

public interface CustomerService {

    public List<GetAllCustomersResponse> getAll();
    public GetByIdCustomerResponse getById(int id);
    void add(CreateCustomerRequest createCustomerRequest);
    void update(UpdateCustomerRequest updateCustomerRequest);
    void delete(int id);
}
