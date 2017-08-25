// Built from tag v1.1.0-rc2

package no.fint.model.utdanning.gruppe;

import java.util.Arrays;
import java.util.List;

public enum GruppeActions {

    GET_BASISGRUPPE,
    GET_ALL_BASISGRUPPE,
    UPDATE_BASISGRUPPE,
    GET_KONTAKTLARERGRUPPE,
    GET_ALL_KONTAKTLARERGRUPPE,
    UPDATE_KONTAKTLARERGRUPPE;


    /**
     * Gets a list of all enums as string
     *
     * @return A string list of all enums
     */
    public static List<String> getActions() {
        return Arrays.asList(
                Arrays.stream(GruppeActions.class.getEnumConstants()).map(Enum::name).toArray(String[]::new)
        );
    }

}

