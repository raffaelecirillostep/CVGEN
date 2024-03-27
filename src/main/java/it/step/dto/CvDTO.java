package it.step.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CvDTO {

    private String id;
    private EmployeeDTO employee;
    private List<ExperienceDTO> experiences;
    private List<QualificationDTO> qualifications;
    private OtherDTO other;
    private String state;
    private Date createdAt;
    private Date modifiedAt;
    private Boolean isDeleted;
    private Date deletedAt;

}
