package no.fint.model.utdanning.ressurser;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.EqualsAndHashCode;
import no.fint.model.relation.Identifiable;
import no.fint.model.utdanning.basisklasser.Utdanningsforhold;

@Data
@EqualsAndHashCode(callSuper = false)
public class Elevforhold extends Utdanningsforhold implements Identifiable {
    @JsonIgnore
    @Override
    public String getId() {
        return this.getSystemId().getIdentifikatorverdi();
    }

    public enum Relasjonsnavn {
        KATEGORI,
        ELEVRESSURS,
        MEDLEMSKAP
    }
}

