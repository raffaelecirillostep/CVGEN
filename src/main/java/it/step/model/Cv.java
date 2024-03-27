package it.step.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Document(collection = "cvs")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cv {

    @Id
    private String id;
    private Employee employee;
    private List<Experience> experiences;
    private List<Qualification> qualifications;
    private Other other;
    private String state;
    private Date createdAt;
    private Date modifiedAt;
    private Boolean isDeleted;
    private Date deletedAt;

}
