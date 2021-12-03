package com.bytelegend;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ChallengeTest {
    @Test
    public void test() {
        Assertions.assertEquals(Arrays.asList(1, 1, 2, 6, 24, 120, 720),
            Stream.of(0, 1, 2, 3, 4, 5, 6).map(Challenge::factorial).collect(Collectors.toList())
        );
    }
}
