package it.step.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Qualification {

    private Date initialDate;
    private Date endDate;
    private Boolean inProgress;
    private String qualification;
    private String provider;

}
