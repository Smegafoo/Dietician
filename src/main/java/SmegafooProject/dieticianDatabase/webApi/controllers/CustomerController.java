package SmegafooProject.dieticianDatabase.webApi.controllers;

import SmegafooProject.dieticianDatabase.business.abstracts.CustomerService;
import SmegafooProject.dieticianDatabase.business.response.GetAllCustomersResponse;
import SmegafooProject.dieticianDatabase.entities.concretes.Customer;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
