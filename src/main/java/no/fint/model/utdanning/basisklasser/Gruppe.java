// Built from tag v1.1.0-rc3

package no.fint.model.utdanning.basisklasser;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import no.fint.model.felles.kompleksedatatyper.Periode;
import no.fint.model.felles.kompleksedatatyper.Identifikator;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public abstract class Gruppe {
	private String beskrivelse;
	private String navn;
	private Periode periode;
	private Identifikator systemId;
	}

