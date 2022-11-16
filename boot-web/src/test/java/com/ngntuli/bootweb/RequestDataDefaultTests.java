package com.ngntuli.bootweb;

import com.ngntuli.bootweb.ch04.models.RequestDataDefault;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class RequestDataDefaultTests {
    RequestDataDefault data;

    @BeforeEach
    public void init() {
        data = new RequestDataDefault();
    }

    @ParameterizedTest
    @CsvSource({
            "Chess, Chess",
            "Yoga, Yoga",
            ", Strange Hobby",
            "'', Strange Hobby",
            "time travel, Strange Hobby"
    })
    void testGetHobby(String actual, String expected) {
        data.setHobby(actual);
        Assertions.assertEquals(expected, data.getHobby());
    }

    @ParameterizedTest
    @CsvSource({
            "Spinning, Spinning",
            "Hiding, Hiding",
            ", Strange Aversion",
            "'', Strange Aversion",
            "butterfly wings, Strange Aversion"
    })
    void testGetAversion(String actual, String expected) {
        data.setAversion(actual);
        Assertions.assertEquals(expected, data.getAversion());
    }

    @ParameterizedTest
    @CsvSource({
            "Chess, true",
            "Yoga, true",
            ", false",
            "'', false",
            "time travel, false"
    })
    void testIsValidHobby(String actual, boolean valid) {
        data.setHobby(actual);
        Assertions.assertEquals(valid, data.isValidHobby());
    }

    @ParameterizedTest
    @CsvSource({
            "Spinning, true",
            "Hiding, true",
            ", false",
            "'', false",
            "butterfly wings, false"
    })
    void testIsValidAversion(String actual, boolean valid) {
        data.setAversion(actual);
        Assertions.assertEquals(valid, data.isValidAversion());
    }
}
