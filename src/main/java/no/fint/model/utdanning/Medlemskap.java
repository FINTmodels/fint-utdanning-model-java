package no.fint.model.utdanning;


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
public class Medlemskap implements Identifiable {
    private Identifikator systemId;

    @JsonIgnore
    @Override
    public String getId() {
        return this.getSystemId().getIdentifikatorverdi();
    }

    public enum Relasjonsnavn {
        MEDLEM,
        FORTLOPENDEKARATER,
        GRUPPE,
        ENDELIGKARAKTER,
        FRAVAR
    }
}

