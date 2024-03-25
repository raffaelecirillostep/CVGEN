package it.step.model;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;

import java.time.LocalDate;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "otherinfos")
public class Otherinfo {

    @Id
    private String id;

    private String title;
    private String description;

    private Boolean isDeleted;

    private Date deletedAt;




}
