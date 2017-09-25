// Built from tag v1.1.0-rc3

package no.fint.model.utdanning.elev;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import no.fint.model.felles.kompleksedatatyper.Identifikator;
import no.fint.model.felles.kompleksedatatyper.Kontaktinformasjon;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Elev {
	public enum Relasjonsnavn {
			PERSON,
			ELEVFORHOLD
	}

	private Identifikator brukernavn;
	private Identifikator elevnummer;
	private Kontaktinformasjon kontaktinformasjon;
	private Identifikator systemId;
	}
