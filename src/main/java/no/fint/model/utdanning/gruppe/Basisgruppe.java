package no.fint.model.utdanning.gruppe;


import lombok.Data;
import lombok.EqualsAndHashCode;
import no.fint.model.felles.kompleksedatatyper.Kontaktinformasjon;
import no.fint.model.utdanning.basisklasser.Gruppe;

@Data
@EqualsAndHashCode(callSuper = false)
public class Basisgruppe extends Gruppe {
    private Kontaktinformasjon kontaktinformasjon;

    public enum Relasjonsnavn {
        TRINN,
        KONTAKTLARERGRUPPE
    }
}

