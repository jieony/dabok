package dabok.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter @Setter
public class Customer {

    @Id
    @GeneratedValue
    @Column(name = "customer_code")
    private Long customerCd;

    @OneToMany(mappedBy = "customer")
    private Order order;

    private String name;

    private String id;

    private String pwd;

    private String email;

    private String mobile;

    private String mobileAuthYn;

    private LocalDateTime joinDt;

    @Embedded
    private Address address;

    private String gender;

    private int age;

    private LocalDateTime birthday;

    private String profileUrl;  // [확인필요] 이미지 테이블 분리여부

}
