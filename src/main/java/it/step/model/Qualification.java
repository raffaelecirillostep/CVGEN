package it.step.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "Qualifications")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Qualification {

    private String type;
    private String qualification;
    private String institute;
    private String description;
    private Date qualificationDate;
    private int vote;

}
