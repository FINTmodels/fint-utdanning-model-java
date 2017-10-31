// Built from tag v2.2.0

package no.fint.model.utdanning.elev;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import java.util.List;
import no.fint.model.*;

import no.fint.model.felles.kompleksedatatyper.Identifikator;
import no.fint.model.felles.kompleksedatatyper.Kontaktinformasjon;

@Data
@EqualsAndHashCode
@ToString
public class Elev implements FintMainObject {
	public enum Relasjonsnavn {
			PERSON,
			ELEVFORHOLD
	}

	private Identifikator brukernavn;
	private Identifikator elevnummer;
	private Kontaktinformasjon kontaktinformasjon;
	private Identifikator systemId;
	}
