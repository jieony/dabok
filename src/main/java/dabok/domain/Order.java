package dabok.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "ORDER_TABLE")
@Getter @Setter
public class Order {

    @Id
    @GeneratedValue
    @Column(name = "order_id")
    private Long orderId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id")
    private Customer customer;

    // [추가예정] 판매자 entity

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "delivery_id")
    private Delivery delivery;

    private LocalDateTime orderDt;

    private String paymentYn;

    private int orderStatus;    // [재확인 예정] enum으로 변경

    private Long deliveryCharge;

    @Embedded
    private Address address;

    private String recipient;

    private String recipientMobile;

    private Long paymentAmount;


}
