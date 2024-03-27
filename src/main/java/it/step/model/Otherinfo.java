package it.step.model;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

import java.time.LocalDate;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Otherinfo {


    private String id;

    private String title;
    private String description;

    private Boolean isDeleted;

    private Date deletedAt;




}
