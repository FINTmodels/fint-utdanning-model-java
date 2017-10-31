// Built from tag v2.2.0

package no.fint.model.utdanning.basisklasser;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import java.util.List;
import no.fint.model.*;

import no.fint.model.felles.kompleksedatatyper.Identifikator;

@Data
@EqualsAndHashCode
@ToString
public abstract class Utdanningsforhold implements FintAbstractObject {
	private String beskrivelse;
	private Identifikator systemId;
	}
