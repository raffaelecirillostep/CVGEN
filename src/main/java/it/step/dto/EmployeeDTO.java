package it.step.dto;

import it.step.model.Province;
import it.step.model.Qualification;
import it.step.model.Town;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDTO {

    private String id;
    private String name;
    private String surname;
    private TownDTO town;
    private ProvinceDTO province;
    private String gender;
    private Date dob;
    private String nationality;
    private String telephone;
    private String email;
    private Boolean isDeleted;
    private Date deletedAt;

}
