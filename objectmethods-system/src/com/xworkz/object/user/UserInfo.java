package com.xworkz.object.user;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserInfo {
    private int userId;
    private String firstName;
    private  String lastName;
    private long phoneNo;


}
