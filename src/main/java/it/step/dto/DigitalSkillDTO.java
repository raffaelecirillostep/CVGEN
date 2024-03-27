package it.step.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DigitalSkillDTO {

    private String id;
    private String skill;
    private Boolean isDeleted = false;
    private Date deletedAt;

}
