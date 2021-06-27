package dabok.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter @Setter
public class OrderSlip {

    @Id
    @GeneratedValue
    @Column(name = "order_slip_code")
    private Long orderSlipCode;

    // [추가예정] 상품 entity

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_code")
    private Order order;

    private Long amount;    // 수량
    
    private Long price;     // 상품금액

}
