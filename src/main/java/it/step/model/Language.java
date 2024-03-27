package it.step.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "languages")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Language {

    @Id
    private String id;
    private String language;
    private boolean isDeleted;
    private Date deletedAt;
}
