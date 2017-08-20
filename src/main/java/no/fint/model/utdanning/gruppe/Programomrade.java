package no.fint.model.utdanning.gruppe;

import lombok.Data;
import lombok.EqualsAndHashCode;
import no.fint.model.utdanning.basisklasser.Kodegruppe;

@Data
@EqualsAndHashCode(callSuper = false)
public class Programomrade extends Kodegruppe {
    public enum Relasjonsnavn {
        UTDANNINGSPROGRAM,
        FAG,
        TRINN,
        KODE,
        MEDLEMSKAP
    }
}

