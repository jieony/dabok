package dabok.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class Customer {

    @Id
    @GeneratedValue
    @Column(name = "customer_id")
    private Long customerId;

    @OneToMany(mappedBy = "customer")
    private List<Order> orderList = new ArrayList<>();

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

    private String profileUrl;  // [수정예정] 이미지테이블 분리

}
