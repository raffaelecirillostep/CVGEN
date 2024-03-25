package it.step.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "technologies")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Technology {

    private String name;
    private String description;
    private boolean isDeleted;
    private Date deletedAt;

}
