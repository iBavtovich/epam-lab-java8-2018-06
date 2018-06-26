package streams.part2.exercise;

import org.junit.Test;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

public class Exercise3 {

    @Test
    public void createLimitedStringWithOddNumbersSeparatedBySpaces() {
        int countNumbers = 10;

        String result = IntStream.iterate(1, i -> i + 2)
                                 .limit(countNumbers)
                                 .mapToObj(String::valueOf)
                                 .collect(Collectors.joining(" "));

        assertEquals("1 3 5 7 9 11 13 15 17 19", result);
    }

    @Test
    public void extractEvenNumberedCharactersToNewString() {
        String source = "abcdefghijklm";

        String result = source.chars()
                              .filter(i -> i % 2 == 1)
                              .mapToObj(i -> Character.toString((char) i))
                              .collect(Collectors.joining());

        assertEquals("acegikm", result);
    }
}
