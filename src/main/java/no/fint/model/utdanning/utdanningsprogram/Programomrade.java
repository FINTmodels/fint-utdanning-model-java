// Built from tag v2.6.0

package no.fint.model.utdanning.utdanningsprogram;

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
public class Programomrade extends Gruppe implements FintMainObject {
    public enum Relasjonsnavn {
            UTDANNINGSPROGRAM,
            FAG,
            TRINN,
            GREPREFERANSE,
            VIGOREFERANSE,
            MEDLEMSKAP
    }

}
