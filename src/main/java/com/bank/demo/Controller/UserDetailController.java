package com.bank.demo.Controller;

import com.bank.demo.DTO.UserDetialsReqRes;
import com.bank.demo.Model.UserDetail;
import com.bank.demo.service.UserDetialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;


@RestController
@Controller
public class UserDetailController {
    @Autowired
    private UserDetialService userDetialService;

//    @PostMapping("/admin/register")
//    public ResponseEntity<UserDetialsReqRes>  register(@RequestBody UserDetialsReqRes reqRes){
//        return ResponseEntity.ok(userDetialService.userRegistration(reqRes));
//    }


    @PostMapping("/admin/register")
    public ModelAndView register(UserDetialsReqRes reqRes , Model model){
        UserDetialsReqRes userDetialsReqRes = userDetialService.userRegistration(reqRes);
        if(userDetialsReqRes!=null){
            String message = "hello" + userDetialsReqRes.getUserName()+" "+userDetialsReqRes.getEmail();
            model.addAttribute("Msg" , message);
        }
        return  new ModelAndView("Success");
    }





//    @GetMapping("/registerpage")
//    public String getRegisterPage( Model model) {
//        model.addAttribute("user", new UserDetail());
//        return "UserRegistrationPage";
//    }


    @GetMapping("/admin/userdetials")
    public ResponseEntity<UserDetialsReqRes> getalluser(){
        return ResponseEntity.ok(userDetialService.getAllUserDetial());
    }

}
