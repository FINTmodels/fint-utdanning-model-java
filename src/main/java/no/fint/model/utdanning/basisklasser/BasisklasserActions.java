// Built from tag v1.1.0-rc2

package no.fint.model.utdanning.basisklasser;

import java.util.Arrays;
import java.util.List;

public enum BasisklasserActions {

    GET_UNDERVISNINGSFORHOLD,
    GET_ALL_UNDERVISNINGSFORHOLD,
    UPDATE_UNDERVISNINGSFORHOLD;


    /**
     * Gets a list of all enums as string
     *
     * @return A string list of all enums
     */
    public static List<String> getActions() {
        return Arrays.asList(
                Arrays.stream(BasisklasserActions.class.getEnumConstants()).map(Enum::name).toArray(String[]::new)
        );
    }

}

