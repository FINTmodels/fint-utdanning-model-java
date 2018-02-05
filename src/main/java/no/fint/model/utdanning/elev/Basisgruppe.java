// Built from tag v2.4.0-rc-4

package no.fint.model.utdanning.elev;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NonNull;
import java.util.List;
import no.fint.model.*;

import no.fint.model.utdanning.basisklasser.Gruppe;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper=true)
@ToString(callSuper=true)
public class Basisgruppe extends Gruppe implements FintMainObject {
    public enum Relasjonsnavn {
            TRINN,
            KONTAKTLARERGRUPPE,
            GREPREFERANSE,
            VIGOREFERANSE,
            MEDLEMSKAP
    }

}
