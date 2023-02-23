package kimdevhwan.justcode.jpaconverterseedcrypto.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CryptoController {

    @Autowired
    private CryptoService cryptoService;

    @PostMapping("/encryption")
    public ResponseEntity<String> encryption(@RequestBody String privacyInfomation){
        String encrypted = cryptoService.encryption(privacyInfomation);
        return ResponseEntity.ok(encrypted);
    }
}
