package it.step.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OtherinfoDTO {


    private Integer id;
    private String title;
    private String description;
    private Boolean isDeleted;
    private Date deletedAt;

}
