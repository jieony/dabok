package dabok.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "ORDER_TABLE")
@Getter @Setter
public class Order {

    @Id
    @GeneratedValue
    @Column(name = "order_code")
    private Long orderCode;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_code")
    private Customer customer;

    // [추가예정] 판매자 entity

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "delivery_code")
    private Delivery delivery;

    @OneToMany(mappedBy = "order")
    private List<OrderSlip> orderSlipList = new ArrayList<>();

    private LocalDateTime orderDt;  // 주문일자

    private String paymentYn;   // 입금여부

    private int orderStatus;    // [재확인 예정] enum으로 변경

    private Long deliveryCharge;    // 배송비

    @Embedded
    private Address address;    // 배송주소

    private String recipient;   // 수령인

    private String recipientMobile; // 수령인 연락처

    private Long paymentAmount;     // 최종결제금액


}
