// Built from tag v1.1.0-rc2

package no.fint.model.utdanning.timeplan;

import java.util.Arrays;
import java.util.List;

public enum TimeplanActions {

    GET_TIME,
    GET_ALL_TIME,
    UPDATE_TIME;


    /**
     * Gets a list of all enums as string
     *
     * @return A string list of all enums
     */
    public static List<String> getActions() {
        return Arrays.asList(
                Arrays.stream(TimeplanActions.class.getEnumConstants()).map(Enum::name).toArray(String[]::new)
        );
    }

}

