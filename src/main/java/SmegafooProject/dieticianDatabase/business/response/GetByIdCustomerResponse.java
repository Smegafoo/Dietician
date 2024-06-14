package SmegafooProject.dieticianDatabase.business.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class GetByIdCustomerResponse {
    private int id;
    private String name;
    private String subsDate;
    private String employeeName;
}
