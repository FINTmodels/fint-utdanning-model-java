// Built from tag v2.6.0-beta-1

package no.fint.model.utdanning.elev;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NonNull;
import java.util.List;
import no.fint.model.*;

import no.fint.model.utdanning.basisklasser.Utdanningsforhold;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper=true)
@ToString(callSuper=true)
public class Elevforhold extends Utdanningsforhold implements FintMainObject {
    public enum Relasjonsnavn {
            ELEV,
            KATEGORI,
            SKOLE,
            MEDLEMSKAP
    }

}
