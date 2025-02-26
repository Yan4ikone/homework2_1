package helpers;



import org.junit.jupiter.params.provider.Arguments;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class DataProvider {

    public static Stream<Arguments> providerCheckingElements() {
            return Stream.of(
                    Arguments.of("iPhone")
            );
        }

        public static Stream<Arguments> providerCheckingElementsList() {
            List<String> elements = new ArrayList<>();
            elements.add("HP");
            elements.add("Lenovo");
            return Stream.of(
                    Arguments.of(elements)
            );
        }
}

