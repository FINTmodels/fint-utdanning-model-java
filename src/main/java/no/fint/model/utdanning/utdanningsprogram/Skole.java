// Built from tag v2.0.10

package no.fint.model.utdanning.utdanningsprogram;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import java.util.List;

import no.fint.model.felles.kompleksedatatyper.Identifikator;
import no.fint.model.felles.basisklasser.Enhet;

@Data
@EqualsAndHashCode(callSuper=true)
@ToString(callSuper=true)
public class Skole extends Enhet {
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

