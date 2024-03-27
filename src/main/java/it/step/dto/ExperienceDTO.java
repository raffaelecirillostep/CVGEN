package it.step.dto;

import it.step.model.Technology;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExperienceDTO {

    private String id;
    private Date startedAt;
    private Date endedAt;
    private Boolean inProgress;
    private String jobTitle;
    private String projectName;
    private String customerName;
    private String description;
    private List<String> technologies;
    private boolean isDeleted = false;
    private Date deletedAt;
}
