// Built from tag v2.0.10

package no.fint.model.utdanning.kompleksedatatyper;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import java.util.List;

import no.fint.model.felles.kompleksedatatyper.Periode;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Fravar {
	public enum Relasjonsnavn {
			FRAVARSTYPE
	}

	private boolean dokumentert;
	private boolean foresPaVitnemal;
	private Periode gjelderPeriode;
	private String kommentar;
	}

