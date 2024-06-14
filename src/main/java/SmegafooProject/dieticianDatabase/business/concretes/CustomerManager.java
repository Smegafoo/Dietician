package SmegafooProject.dieticianDatabase.business.concretes;

import SmegafooProject.dieticianDatabase.business.abstracts.CustomerService;
import SmegafooProject.dieticianDatabase.business.request.CreateCustomerRequest;
import SmegafooProject.dieticianDatabase.business.request.UpdateCustomerRequest;
import SmegafooProject.dieticianDatabase.business.response.GetByIdCustomerResponse;
import SmegafooProject.dieticianDatabase.core.utilities.mappers.ModelMapperService;
import SmegafooProject.dieticianDatabase.business.response.GetAllCustomersResponse;
import SmegafooProject.dieticianDatabase.dataAcces.abstracts.CustomerRepository;
import SmegafooProject.dieticianDatabase.entities.concretes.Customer;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
@AllArgsConstructor
public class CustomerManager implements CustomerService {
    private CustomerRepository customerRepository;
    private ModelMapperService modelMapperService;


    @Override
    public List<GetAllCustomersResponse> getAll() {
        List<Customer> customers=customerRepository.findAll();

        List<GetAllCustomersResponse> customersResponses=customers.stream().
                map(customer -> this.modelMapperService.forResponse().
                        map(customer,GetAllCustomersResponse.class)).collect(Collectors.toList());

        return customersResponses;
    }

    @Override
    public GetByIdCustomerResponse getById(int id ) {
        Customer customer=customerRepository.findById(id).orElseThrow();

        GetByIdCustomerResponse response=this.modelMapperService.forResponse().map(customer,GetByIdCustomerResponse.class);

        return response;
    }

    @Override
    public void add(CreateCustomerRequest createCustomerRequest) {

        Customer customer=this.modelMapperService.forRequest().map(createCustomerRequest ,Customer.class);

        this.customerRepository.save(customer);

    }

    @Override
    public void update(UpdateCustomerRequest updateCustomerRequest) {
        Customer customer =this.modelMapperService.forRequest().map(updateCustomerRequest,Customer.class);
        this.customerRepository.save(customer);

    }

    @Override
    public void delete(int id) {
        Customer customer=customerRepository.findById(id).orElseThrow();
        customerRepository.delete(customer);
    }
}
