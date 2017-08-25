// Built from tag v1.1.0-rc2

package no.fint.model.utdanning.gruppe;

import lombok.Data;
import lombok.EqualsAndHashCode;
import no.fint.model.felles.kompleksedatatyper.Kontaktinformasjon;
import no.fint.model.utdanning.basisklasser.Kodegruppe;

@Data
@EqualsAndHashCode(callSuper = false)
public class Undervisningsgruppe extends Kodegruppe {
    public enum Relasjonsnavn {
        FAG,
        TIME,
        KODE,
        MEDLEMSKAP
    }

    private Kontaktinformasjon kontaktinformasjon;
}

