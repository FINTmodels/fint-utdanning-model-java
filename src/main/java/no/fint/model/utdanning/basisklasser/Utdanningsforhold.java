// Built from tag v2.6.0-beta-3

package no.fint.model.utdanning.basisklasser;

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
public abstract class Utdanningsforhold implements FintAbstractObject {
    @NonNull
    private String beskrivelse;
    @NonNull
    private Identifikator systemId;
}
