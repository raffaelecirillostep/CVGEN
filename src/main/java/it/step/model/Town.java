package it.step.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "towns")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Town {

    @Id
    private String id;
    private String name;
    private Boolean isDeleted;
    private Date deletedAt;


}