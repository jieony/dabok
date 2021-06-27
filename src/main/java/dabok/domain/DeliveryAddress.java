package dabok.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter @Setter
public class DeliveryAddress {

    @Id
    @GeneratedValue
    @Column(name = "delivery_address_code")
    private Long DeliveryAddressCode;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_code")
    private Customer customer;

    @Embedded
    private Address address;
}
