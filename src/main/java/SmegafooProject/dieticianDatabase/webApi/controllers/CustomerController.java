package SmegafooProject.dieticianDatabase.webApi.controllers;

import SmegafooProject.dieticianDatabase.business.abstracts.CustomerService;
import SmegafooProject.dieticianDatabase.business.request.CreateCustomerRequest;
import SmegafooProject.dieticianDatabase.business.request.UpdateCustomerRequest;
import SmegafooProject.dieticianDatabase.business.response.GetAllCustomersResponse;
import SmegafooProject.dieticianDatabase.business.response.GetByIdCustomerResponse;
import SmegafooProject.dieticianDatabase.entities.concretes.Customer;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {
    private CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/getAll")
    public List<GetAllCustomersResponse> getAll(){
        return customerService.getAll();
    }

    @GetMapping("/{id}")
    public GetByIdCustomerResponse getById(@PathVariable int id){
        return customerService.getById(id);
    }


    @PostMapping("/add")
    @ResponseStatus(code = HttpStatus.CREATED)
    public void add(CreateCustomerRequest createCustomerRequest){
        this.customerService.add(createCustomerRequest);
    }
    @PutMapping
    public void update(@RequestBody UpdateCustomerRequest updateCustomerRequest){
        this.customerService.update(updateCustomerRequest);
    }

    @DeleteMapping("/{id}")
    public void delete(int id){
        this.customerService.delete(id);
    }




}
