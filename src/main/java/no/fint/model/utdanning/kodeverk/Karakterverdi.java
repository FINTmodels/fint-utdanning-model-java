package no.fint.model.utdanning.kodeverk;


import lombok.Data;
import lombok.EqualsAndHashCode;
import no.fint.model.felles.basisklasser.Begrep;

@Data
@EqualsAndHashCode(callSuper = false)
public class Karakterverdi extends Begrep {
    public enum Relasjonsnavn {
        SKALA
    }
}

