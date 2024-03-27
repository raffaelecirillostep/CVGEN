package it.step.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Document(collection = "employees")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    @Id
    private String id;
    private String name;
    private String surname;
    private Town town;
    private Province province;
    private String gender;
    private Date dob;
    private String nationality;
    private String telephone;
    private String email;
    private Boolean isDeleted = false;
    private Date deletedAt;

}
