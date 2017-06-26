package no.fint.model.utdanning.gruppe;


import lombok.Data;
import lombok.EqualsAndHashCode;
import no.fint.model.felles.kompleksedatatyper.Kontaktinformasjon;
import no.fint.model.utdanning.basisklasser.Kodegruppe;

@Data
@EqualsAndHashCode(callSuper = false)
public class Undervisningsgruppe extends Kodegruppe {
    private Kontaktinformasjon kontaktinformasjon;

    public enum Relasjonsnavn {
        FAG
    }
}

