package com.cham.codeexercise.modarate;

import net.bytebuddy.implementation.bind.annotation.IgnoreForBinding;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CeasarCipherTest {

    private final CeasarCipher ceasarCipher = new CeasarCipher();

    private final String cipherText = "diozmqdzr";

    private final String plainTest = "interview";

    @Test
    public void shouldTestDecode(){
        assertEquals(ceasarCipher.decode(cipherText), plainTest);
    }
}