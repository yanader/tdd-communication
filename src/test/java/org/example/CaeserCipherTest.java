package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CaeserCipherTest {

    CaeserCipher cc;

    @BeforeEach
    void setup() {
        cc = new CaeserCipher();
    }

    @Test
    void cipher() {
        String inputOne = "northcoders";
        String inputTwo = "abegupbqref";
        String inputThree = "I'm sure glad nobody can read my secret ROT13 code.";

        assertAll(() -> {
            assertEquals("abegupbqref", cc.cipher(inputOne));
            assertEquals("northcoders", cc.cipher(inputTwo));
            assertEquals("V'z fher tynq abobql pna ernq zl frperg EBG13 pbqr.", cc.cipher(inputThree));
        });

    }
}