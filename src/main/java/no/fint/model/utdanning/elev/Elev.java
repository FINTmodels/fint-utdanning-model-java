// Built from tag v2.0.10

package no.fint.model.utdanning.elev;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import java.util.List;

import no.fint.model.felles.kompleksedatatyper.Identifikator;
import no.fint.model.felles.kompleksedatatyper.Kontaktinformasjon;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
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

