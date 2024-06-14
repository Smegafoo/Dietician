package SmegafooProject.dieticianDatabase.business.request;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CreateCustomerRequest {
    private String name;
    private String subsDate;
    private String email;
    private String phone;

}
