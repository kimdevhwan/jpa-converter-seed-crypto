package kimdevhwan.justcode.jpaconverterseedcrypto.api;

import kimdevhwan.justcode.jpaconverterseedcrypto.security.privacyInfoConverter;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Table(name = "privacy")
@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class PrivacyEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(nullable = false)
    @Convert(converter = privacyInfoConverter.class)
    private String privacyInfo;

    @Builder
    public PrivacyEntity(String privacyInfo){
        this.privacyInfo = privacyInfo;
    }
}
