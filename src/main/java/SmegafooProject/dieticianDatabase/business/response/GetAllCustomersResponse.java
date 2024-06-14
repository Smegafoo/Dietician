package SmegafooProject.dieticianDatabase.business.response;

import SmegafooProject.dieticianDatabase.entities.concretes.Employee;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class GetAllCustomersResponse {
    private int id;
    private String name;
    private String subsDate;
    private String employeeName;

}
