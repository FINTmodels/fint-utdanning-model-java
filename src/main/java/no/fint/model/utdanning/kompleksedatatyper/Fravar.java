// Built from tag v2.2.0

package no.fint.model.utdanning.kompleksedatatyper;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import java.util.List;
import no.fint.model.*;

import no.fint.model.felles.kompleksedatatyper.Periode;

@Data
@EqualsAndHashCode
@ToString
public class Fravar implements FintComplexDatatypeObject {
	public enum Relasjonsnavn {
			FRAVARSTYPE
	}

	private boolean dokumentert;
	private boolean foresPaVitnemal;
	private Periode gjelderPeriode;
	private String kommentar;
	}
