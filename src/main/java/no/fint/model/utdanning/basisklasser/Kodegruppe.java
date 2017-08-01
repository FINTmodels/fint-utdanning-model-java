package no.fint.model.utdanning.basisklasser;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.EqualsAndHashCode;
import no.fint.model.relation.Identifiable;
import no.fint.model.utdanning.kompleksedatatyper.Periodegruppe;

@Data
@EqualsAndHashCode(callSuper = false)
public abstract class Kodegruppe extends Gruppe implements Identifiable {
    private Periodegruppe gyldighetsperiode;

    @JsonIgnore
    @Override
    public String getId() {
        return this.getSystemId().getIdentifikatorverdi();
    }
}

