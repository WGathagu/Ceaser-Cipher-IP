import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DecryptTest {
    @Test
    public void runDecrypt_instantiates(){
        Decrypt testDecrypt = new Decrypt("abcdef", 1);
        assertEquals(true, testDecrypt instanceof Decrypt);
    }

    @Test
    public void runDecrypt_ifInputIsString() {
        Decrypt testDecrypt = new Decrypt("abcdef", 1);
        assertEquals("abcdef", testDecrypt.getInputString());
    }

    @Test
    public void runDecrypt_ifKeyIsInt() {
        Decrypt testDecrypt = new Decrypt("abcdef",1);
        assertEquals(1, testDecrypt.getCharacterChange());
    }
    @Test
    public void runDecrypt_ifDecryptsVariousInputs() {
        Decrypt testDecrypt = new Decrypt("HDUWK 256 LV URXQG!!", 3);
        // does not decrypt integers and other characters but returns them as is
        assertEquals("EARTH 256 IS ROUND!!", Decrypt.decrypt(testDecrypt));
    }
}
