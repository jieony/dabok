package dabok.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter @Setter
public class Delivery {

    @Id
    @GeneratedValue
    @Column(name = "delivery_code")
    private Long deliveryCode;

    @OneToOne(mappedBy = "delivery", fetch = FetchType.LAZY)
    private Order order;

    private String billingNum;   // 운송장번호

    private int status;          // 배송상태 [재확인예정] enum으로 변경

    private LocalDateTime startDt;      // 배송출발일시

    private LocalDateTime arrivalDt;    // 배송도착일시

    private String fixYn;               // 구매확정여부

}
