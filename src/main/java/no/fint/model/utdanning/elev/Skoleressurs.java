// Built from tag v2.8.0

package no.fint.model.utdanning.elev;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NonNull;
import java.util.List;
import no.fint.model.*;

import no.fint.model.felles.kompleksedatatyper.Identifikator;

@Data
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Skoleressurs implements FintMainObject {
    public enum Relasjonsnavn {
            PERSONALRESSURS,
            UNDERVISNINGSFORHOLD
    }

    private Identifikator feidenavn;
    @NonNull
    private Identifikator systemId;
}