// Built from tag v2.6.0-rc-1

package no.fint.model.utdanning.kodeverk;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NonNull;
import java.util.List;
import no.fint.model.*;

import no.fint.model.felles.basisklasser.Begrep;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper=true)
@ToString(callSuper=true)
public class Karakterskala extends Begrep implements FintMainObject {
    public enum Relasjonsnavn {
            VIGOREFERANSE,
            VERDI
    }

}
