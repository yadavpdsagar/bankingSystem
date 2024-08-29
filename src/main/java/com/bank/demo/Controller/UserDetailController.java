package com.bank.demo.Controller;

import com.bank.demo.DTO.UserDetialsReqRes;
import com.bank.demo.service.UserDetialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserDetailController {
    @Autowired
    private UserDetialService userDetialService;
    @PostMapping("/admin/register")
    public ResponseEntity<UserDetialsReqRes>  register(@RequestBody UserDetialsReqRes reqRes){
        return ResponseEntity.ok(userDetialService.userRegistration(reqRes));
    }

    @GetMapping("/admin/userdetials")
    public ResponseEntity<UserDetialsReqRes> getalluser(){
        return ResponseEntity.ok(userDetialService.getAllUserDetial());
    }

}
