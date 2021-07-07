package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UpdateUtilsTest {

    @Test
    void test() {
        assertEquals("Update", UpdateUtils.say());
    }
}
