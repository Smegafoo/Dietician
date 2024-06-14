package SmegafooProject.dieticianDatabase.business.request;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UpdateCustomerRequest {
    private int id;
    private String name;
    private String subsDate;
    private String email;
    private String phone;
    private int employeeId;

}
