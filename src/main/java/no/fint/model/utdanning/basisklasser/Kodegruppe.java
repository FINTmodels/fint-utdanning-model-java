// Built from tag v1.1.0-rc2

package no.fint.model.utdanning.basisklasser;

import lombok.Data;
import lombok.EqualsAndHashCode;
import no.fint.model.utdanning.kompleksedatatyper.Periodegruppe;

@Data
@EqualsAndHashCode(callSuper = false)
public abstract class Kodegruppe extends Gruppe {
    private Periodegruppe gyldighetsperiode;
}

