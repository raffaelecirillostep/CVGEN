package it.step.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("provinces")
@NoArgsConstructor
@AllArgsConstructor
public class Province {

    @Id
    private String id;
    private Integer id_provincia;
    private String sigla;
    private  String provincia;
}
