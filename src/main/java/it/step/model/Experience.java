package it.step.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Experience {

    private String id;
    private Date startedAt;
    private Date endedAt;
    private Boolean inProgress;
    private String jobTitle;
    private String projectName;
    private String customerName;
    private String description;
    private List<String> technologies;
    private Boolean isDeleted = false;
    private Date deletedAt;
}
