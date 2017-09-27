// Built from tag v2.0.0

package no.fint.model.utdanning.elev;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import java.util.List;

import no.fint.model.felles.kompleksedatatyper.Identifikator;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Medlemskap {
	public enum Relasjonsnavn {
			FRAVAR,
			FORTLOPENDEVURDERING,
			ENDELIGVURDERING,
			DELTAKER,
			GRUPPE
	}

	private Identifikator systemId;
	}

