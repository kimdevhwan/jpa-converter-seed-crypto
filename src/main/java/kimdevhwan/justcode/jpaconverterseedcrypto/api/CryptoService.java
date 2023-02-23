package kimdevhwan.justcode.jpaconverterseedcrypto.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CryptoService {

    @Autowired
    private CryptoRepository cryptoRepository;

    public String encryption(String privacyInfo){

        PrivacyEntity privacy = PrivacyEntity.builder()
                .privacyInfo(privacyInfo)
                .build();

        cryptoRepository.save(privacy);

        return privacy.getPrivacyInfo();
    }

}
