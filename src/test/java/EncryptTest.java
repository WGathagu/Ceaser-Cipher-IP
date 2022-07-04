import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EncryptTest {
    @Test
    public void runEncrypt_instantiates(){
        Encrypt testEncrypt = new Encrypt("abcdef",2);
        assertEquals(true, testEncrypt instanceof Encrypt);
    }

    @Test
    public void runEncrypt_ifInputIsString() {
        Encrypt testEncrypt = new Encrypt("abcdef",3);
        assertEquals("abcdef", testEncrypt.getInputString());
    }

    @Test
    public void runDecrypt_ifKeyIsInt() {
        Encrypt testEncrypt = new Encrypt("abcdef",2);
        assertEquals(2, testEncrypt.getcChange());
    }
    @Test
    public void runEncrypt_ifEncryptsVariousInputs() {
        Encrypt testEncrypt = new Encrypt("EARTH 256 IS ROUND!!", 3);
        // does not decrypt integers and other characters but returns them as is
        assertEquals("HDUWK 256 LV URXQG!!",Encrypt.encrypt(testEncrypt));
    }
}
