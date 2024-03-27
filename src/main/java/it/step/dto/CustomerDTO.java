package it.step.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDTO {

    private Date initialDate;
    private Date endDate;
    private Boolean inProgress;
    private String qualification;
    private String provider;

}
