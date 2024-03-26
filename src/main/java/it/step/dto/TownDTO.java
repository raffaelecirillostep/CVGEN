package it.step.dto;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TownDTO {

    private String id;


    private Integer ID;

    private Date DATAISTITUZIONE;

    private Date DATACESSAZIONE;

    private String CODISTAT;

    private String CODCATASTALE;

    private String DENOMINAZIONE_IT;

    private String DENOMTRASLITTERATA;

    private String ALTRADENOMINAZIONE;

    private String ALTRADENOMTRASLITTERATA;

    private Integer ID_PROVINCIA;

    private String IDPROVINCIAISTAT;

    private String IDREGIONE;

    private String IDPREFETTURA;

    private String STATO;

    private String SIGLAPROVINCIA;

    private String FONTE;

    private Date DATAULTIMOAGG;

    private String COD_DENOM;



}
