package it.step.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "projects")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Project {

    @Id
    private String id;
    private String order;
    private String title;
	private String description;
    private Date initialDate;
	private Date endDate;
    private Customer customer;
    private boolean isDeleted;
    private Date deletedAt;

}
