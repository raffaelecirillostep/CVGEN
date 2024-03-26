package it.step.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Document(collection = "experiences")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Experience {

    @Id
    private String id;
    private Date startedAt;
    private Date endedAt;
    private boolean inProgress;
    private String jobTitle;
    private String projectName;
    private String customerName;
    private String description;
    private List<Technology> technologies;
    private boolean isDeleted = false;
    private Date deletedAt;
}
