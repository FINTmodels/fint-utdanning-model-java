package no.fint.model.utdanning.organisasjon;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.EqualsAndHashCode;
import no.fint.model.felles.basisklasser.Enhet;
import no.fint.model.felles.kompleksedatatyper.Identifikator;
import no.fint.model.relation.Identifiable;

@Data
@EqualsAndHashCode(callSuper = false)
public class Skole extends Enhet implements Identifiable {
    private Identifikator skolenummer;
    private String domenenavn;
    private String juridiskNavn;
    private String navn;
    private Identifikator systemId;

    @JsonIgnore
    @Override
    public String getId() {
        return this.getSkolenummer().getIdentifikatorverdi();
    }

    public enum Relasjonsnavn {
        SKOLEEIERTYPE,
        ORGANISASJON,
        UTDANNINGSPROGRAM
    }
}

