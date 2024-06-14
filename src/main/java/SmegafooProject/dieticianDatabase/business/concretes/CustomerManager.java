package SmegafooProject.dieticianDatabase.business.concretes;

import SmegafooProject.dieticianDatabase.business.abstracts.CustomerService;
import SmegafooProject.dieticianDatabase.business.mappers.ModelMapperService;
import SmegafooProject.dieticianDatabase.business.response.GetAllCustomersResponse;
import SmegafooProject.dieticianDatabase.dataAcces.abstracts.CustomerRepository;
import SmegafooProject.dieticianDatabase.entities.concretes.Customer;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
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
}
