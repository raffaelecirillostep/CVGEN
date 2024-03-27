package it.step.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LanguageDTO {

    private String id;
    private String language;
    private Boolean isDeleted;
    private Date deletedAt;
}
