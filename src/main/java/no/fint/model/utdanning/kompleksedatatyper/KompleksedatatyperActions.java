// Built from tag v1.1.0-rc2

package no.fint.model.utdanning.kompleksedatatyper;

import java.util.Arrays;
import java.util.List;

public enum KompleksedatatyperActions {

    ;


    /**
     * Gets a list of all enums as string
     *
     * @return A string list of all enums
     */
    public static List<String> getActions() {
        return Arrays.asList(
                Arrays.stream(KompleksedatatyperActions.class.getEnumConstants()).map(Enum::name).toArray(String[]::new)
        );
    }

}

