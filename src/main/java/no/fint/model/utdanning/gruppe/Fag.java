package no.fint.model.utdanning.gruppe;


import lombok.Data;
import lombok.EqualsAndHashCode;
import no.fint.model.utdanning.basisklasser.Kodegruppe;

@Data
@EqualsAndHashCode(callSuper = false)
public class Fag extends Kodegruppe {
    public enum Relasjonsnavn {
        PROGRAMOMRADE,
        EKSAMENGRUPPE,
        UNDERVISNINGSGRUPPE
    }
}

