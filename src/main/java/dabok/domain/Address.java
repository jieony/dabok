package dabok.domain;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embeddable;

@Embeddable
@Getter
public class Address {

    private String street;  // 도로명

    private String detail;  // 상세주소

    private String zipcode; // 우편번호

    protected Address(){
    }

    public Address(String street, String detail, String zipcode){
        this.street = street;
        this.detail = detail;
        this.zipcode = zipcode;
    }
}
