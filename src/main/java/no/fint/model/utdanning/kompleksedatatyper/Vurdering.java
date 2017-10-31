// Built from tag v2.2.0

package no.fint.model.utdanning.kompleksedatatyper;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import java.util.List;
import no.fint.model.*;

@Data
@EqualsAndHashCode
@ToString
public class Vurdering implements FintComplexDatatypeObject {
	public enum Relasjonsnavn {
			KARAKTER
	}

	private String kommentar;
	}
