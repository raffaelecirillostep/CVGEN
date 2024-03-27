package it.step.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "digitalskills")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DigitalSkill {

    @Id
    private String id;
    private String skill;
    private String level;
    private Boolean isDeleted = false;
    private Date deletedAt;

}
