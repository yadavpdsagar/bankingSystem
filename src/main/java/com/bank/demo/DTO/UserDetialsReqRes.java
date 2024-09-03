package com.bank.demo.DTO;

import com.bank.demo.Model.EmployeeRole;
import com.bank.demo.Model.UserDetail;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Data
@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserDetialsReqRes {
    private int statusCode;
    private String error;
    private String message;
    private String UserName;
    private String email;
    private EmployeeRole role;
    private String password;
    private  UserDetail userDetail;
    private List<UserDetail> userDetailList;

  private AccountDetailReqRes accountDetailReqRes;

}
