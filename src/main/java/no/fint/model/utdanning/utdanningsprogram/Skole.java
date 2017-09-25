// Built from tag v1.1.0-rc3

package no.fint.model.utdanning.utdanningsprogram;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import no.fint.model.felles.kompleksedatatyper.Identifikator;
import no.fint.model.felles.basisklasser.Enhet;

@Data
@EqualsAndHashCode(callSuper=false)
public class Skole extends Enhet {
	public enum Relasjonsnavn {
			ORGANISASJON,
			DOMENENAVN,
			SKOLEEIERTYPE,
			UTDANNINGSPROGRAM
	}

	private String domenenavn;
	private String juridiskNavn;
	private String navn;
	private Identifikator skolenummer;
	private Identifikator systemId;
	}

