package no.fint.model.utdanning.kodeverk;


import lombok.Data;
import lombok.EqualsAndHashCode;
import no.fint.model.utdanning.basisklasser.Gruppekode;

@Data
@EqualsAndHashCode(callSuper = false)
public class Grepkode extends Gruppekode {
    public enum Relasjonsnavn {
        VIGOKODE
    }
}

