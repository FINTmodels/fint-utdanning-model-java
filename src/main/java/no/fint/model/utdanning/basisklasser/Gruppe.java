// Built from tag v3.3.0-rc-1

package no.fint.model.utdanning.basisklasser;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NonNull;
import java.util.List;
import no.fint.model.FintAbstractObject;
import no.fint.model.felles.kompleksedatatyper.Periode;
import no.fint.model.felles.kompleksedatatyper.Identifikator;

@Data
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public abstract class Gruppe implements FintAbstractObject {
    @NonNull
    private String beskrivelse;
    @NonNull
    private String navn;
    @NonNull
    private List<Periode> periode;
    @NonNull
    private Identifikator systemId;
}
