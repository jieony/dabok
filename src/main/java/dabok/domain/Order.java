package dabok.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter @Setter
public class Order {

    @Id
    @GeneratedValue
    @Column(name = "order_code")
    private Long orderCd;

    @ManyToOne
    @JoinColumn(name = "customer_code")
    private Customer customer;

    // (6/14 작성중)

}
