package no.fint.model.utdanning.basisklasser;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.EqualsAndHashCode;
import no.fint.model.relation.Identifiable;

@Data
@EqualsAndHashCode(callSuper = false)
public class Undervisningsforhold extends Utdanningsforhold implements Identifiable {
    @JsonIgnore
    @Override
    public String getId() {
        return this.getSystemId().getIdentifikatorverdi();
    }

    public enum Relasjonsnavn {
        ARBEIDSFORHOLD,
        MEDLEMSKAP
    }
}

