// Built from tag v1.1.0-rc2

package no.fint.model.utdanning.gruppe;

import lombok.Data;
import lombok.EqualsAndHashCode;
import no.fint.model.felles.kompleksedatatyper.Kontaktinformasjon;
import no.fint.model.utdanning.basisklasser.Gruppe;

@Data
@EqualsAndHashCode(callSuper = false)
public class Kontaktlarergruppe extends Gruppe {
    public enum Relasjonsnavn {
        BASISGRUPPE,
        MEDLEMSKAP
    }

    private Kontaktinformasjon kontaktinformasjon;
}

