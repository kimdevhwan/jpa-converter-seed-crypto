package kimdevhwan.justcode.jpaconverterseedcrypto.security;

import java.util.Base64;

public class Seed {
    // TODO: 2023-02-22  비밀키(pbszUserKey)와 벡터키(pbszIV)는 따로 관리해야 한다.
    private static final byte[] pbszUserKey = "testCryptkimdevhwanhahah!@#".getBytes();
    private static final byte[] pbszIV = "1234567890123456".getBytes();

    public static String encrypt(String rawMessage) {
        Base64.Encoder encoder = Base64.getEncoder();
        byte[] encrypted = KISA_SEED_CBC.SEED_CBC_Encrypt(pbszUserKey, pbszIV, rawMessage.getBytes(), 0, rawMessage.getBytes().length);
        return new String(encoder.encode(encrypted));
    }

    public static String decrypt(String encryptedMessage) {
        Base64.Decoder decoder = Base64.getDecoder();
        byte[] message = decoder.decode(encryptedMessage);
        byte[] decrypted = KISA_SEED_CBC.SEED_CBC_Decrypt(pbszUserKey, pbszIV, message, 0, message.length);
        return new String(decrypted);
    }
}
