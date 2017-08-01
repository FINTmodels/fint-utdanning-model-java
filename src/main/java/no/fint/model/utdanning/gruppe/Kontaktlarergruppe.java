package no.fint.model.utdanning.gruppe;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.EqualsAndHashCode;
import no.fint.model.felles.kompleksedatatyper.Kontaktinformasjon;
import no.fint.model.relation.Identifiable;
import no.fint.model.utdanning.basisklasser.Gruppe;

@Data
@EqualsAndHashCode(callSuper = false)
public class Kontaktlarergruppe extends Gruppe implements Identifiable {
    private Kontaktinformasjon kontaktinformasjon;

    @JsonIgnore
    @Override
    public String getId() {
        return this.getSystemId().getIdentifikatorverdi();
    }

    public enum Relasjonsnavn {
        BASISGRUPPE,
        MEDLEMSKAP
    }
}

