// Built from tag v2.0.10

package no.fint.model.utdanning.kompleksedatatyper;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Vurdering {
	public enum Relasjonsnavn {
			KARAKTER
	}

	private String kommentar;
	}

