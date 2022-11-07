package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class SqrtServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/range.csv")
    public void rangeSqrLimit(int expected, int begin, int end) {

        SqrtService service = new SqrtService();

        int actual = service.rangeSqrLimit(begin, end);
        Assertions.assertEquals(expected, actual);
    }
}
