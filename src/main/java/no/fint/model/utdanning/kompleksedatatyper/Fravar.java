// Built from tag v1.1.0-rc3

package no.fint.model.utdanning.kompleksedatatyper;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import no.fint.model.felles.kompleksedatatyper.Periode;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Fravar {
	public enum Relasjonsnavn {
			FRAVARSTYPE
	}

	private boolean dokumentert;
	private boolean foresPaVitnemal;
	private Periode gjelderPeriode;
	private String kommentar;
	}

