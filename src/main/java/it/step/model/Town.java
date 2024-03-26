package it.step.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
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

    @JsonProperty("ID")
    private Integer ID;

    @JsonProperty("DATAISTITUZIONE")
    private Date dataIstituzione;

    @JsonProperty("DATACESSAZIONE")
    private Date dataCessazione;

    @JsonProperty("CODISTAT")
    private String codISTAT;

    @JsonProperty("CODCATASTALE")
    private String codCatastale;

    @JsonProperty("DENOMINAZIONE_IT")
    private String denominazioneIt;

    @JsonProperty("DENOMTRASLITTERATA")
    private String denominazioneTraslitterata;

    @JsonProperty("ALTRADENOMINAZIONE")
    private String altraDenominazione;

    @JsonProperty("ALTRADENOMTRASLITTERATA")
    private String altraDenominazioneTraslitterata;

    @JsonProperty("ID_PROVINCIA")
    private Integer idProvincia;

    @JsonProperty("IDPROVINCIAISTAT")
    private String idProvinciaIstat;

    @JsonProperty("IDREGIONE")
    private String idRegione;

    @JsonProperty("IDPREFETTURA")
    private String idPrefettura;

    @JsonProperty("STATO")
    private String stato;

    @JsonProperty("SIGLAPROVINCIA")
    private String siglaProvincia;

    @JsonProperty("FONTE")
    private String fonte;

    @JsonProperty("DATAULTIMOAGG")
    private Date dataUltimoAggiornamento;

    @JsonProperty("COD_DENOM")
    private String codDenominazione;

    @JsonProperty("ISDELETED")
    private Boolean isDeleted;

    @JsonProperty("DELETEDAT")
    private Date deletedAt;


}