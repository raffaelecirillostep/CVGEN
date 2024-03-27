package it.step.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class QualificationDTO {

    private String id;
    private String type;
    private String qualification;
    private String institute;
    private String description;
    private Date qualificationDate;
    private Integer vote;
    private Boolean isDeleted;
    private Date deletedAt;

}
