package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class MaxTest {

    @Test
    void thenMax10To5Then10() {
        int left = 10;
        int rigth = 5;
        int result = Max.max(10, 5);
        int expected = 10;
        assertThat(result).isEqualTo(expected);
    }
}