// Built from tag v2.2.0

package no.fint.model.utdanning.elev;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import java.util.List;
import no.fint.model.*;

import no.fint.model.felles.kompleksedatatyper.Identifikator;

@Data
@EqualsAndHashCode
@ToString
public class Medlemskap implements FintMainObject {
	public enum Relasjonsnavn {
			FRAVAR,
			FORTLOPENDEVURDERING,
			ENDELIGVURDERING,
			DELTAKER,
			GRUPPE
	}

	private Identifikator systemId;
	}
