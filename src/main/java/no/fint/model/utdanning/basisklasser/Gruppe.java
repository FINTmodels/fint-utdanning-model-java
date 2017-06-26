package no.fint.model.utdanning.basisklasser;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import no.fint.model.felles.kompleksedatatyper.Identifikator;
import no.fint.model.relation.Identifiable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public abstract class Gruppe implements Identifiable {
    private String beskrivelse;
    private Identifikator systemId;
    private String navn;

    @JsonIgnore
    @Override
    public String getId() {
        return this.getSystemId().getIdentifikatorverdi();
    }

    public enum Relasjonsnavn {
        MEDLEMSKAP
    }
}

