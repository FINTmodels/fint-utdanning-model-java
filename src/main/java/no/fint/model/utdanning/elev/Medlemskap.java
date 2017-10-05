// Built from tag v2.0.10

package no.fint.model.utdanning.elev;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import java.util.List;

import no.fint.model.felles.kompleksedatatyper.Identifikator;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
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

