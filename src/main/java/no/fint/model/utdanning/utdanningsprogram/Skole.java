// Built from tag v2.2.0

package no.fint.model.utdanning.utdanningsprogram;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import java.util.List;
import no.fint.model.*;

import no.fint.model.felles.kompleksedatatyper.Identifikator;
import no.fint.model.felles.basisklasser.Enhet;

@Data
@EqualsAndHashCode(callSuper=true)
@ToString(callSuper=true)
public class Skole extends Enhet implements FintMainObject {
	public enum Relasjonsnavn {
			ORGANISASJON,
			FAG,
			SKOLEEIERTYPE,
			VIGOREFERANSE,
			UTDANNINGSPROGRAM
	}

	private String domenenavn;
	private String juridiskNavn;
	private String navn;
	private Identifikator skolenummer;
	private Identifikator systemId;
	}
