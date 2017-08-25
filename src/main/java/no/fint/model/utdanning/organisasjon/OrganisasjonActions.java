// Built from tag v1.1.0-rc2

package no.fint.model.utdanning.organisasjon;

import java.util.Arrays;
import java.util.List;

public enum OrganisasjonActions {

    GET_SKOLE,
    GET_ALL_SKOLE,
    UPDATE_SKOLE;


    /**
     * Gets a list of all enums as string
     *
     * @return A string list of all enums
     */
    public static List<String> getActions() {
        return Arrays.asList(
                Arrays.stream(OrganisasjonActions.class.getEnumConstants()).map(Enum::name).toArray(String[]::new)
        );
    }

}

