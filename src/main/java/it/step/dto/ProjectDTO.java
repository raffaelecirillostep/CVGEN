package it.step.dto;

import it.step.model.Customer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProjectDTO {

    private String id;
    private String order;
    private String title;
    private String description;
    private Date initialDate;
    private Date endDate;
    private Customer customer;
    private Boolean isDeleted;
    private Date deletedAt;

}
