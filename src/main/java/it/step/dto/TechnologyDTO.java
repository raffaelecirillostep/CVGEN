package it.step.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TechnologyDTO {
    private String id;
    private String name;
    private String description;
    private boolean isDeleted = false;
    private Date deletedAt;
}
