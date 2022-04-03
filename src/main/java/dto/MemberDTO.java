package dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemberDTO {

    String id, password, name, phone, email, address;
    public MemberDTO(){}
}
