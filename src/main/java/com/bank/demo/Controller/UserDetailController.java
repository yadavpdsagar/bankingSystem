package com.bank.demo.Controller;

import com.bank.demo.DTO.UserDetialsReqRes;
import com.bank.demo.Model.UserDetail;
import com.bank.demo.service.UserDetialService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.GetMapping;

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


  // this will fetch page only 
    @GetMapping("/admin/userlistpage")
    public ModelAndView getUserlist() {
    	ModelAndView modelAndView= new ModelAndView("UserDetials");
    	return modelAndView;
    }


 // this will fetch data 
@GetMapping("/admin/userdetials")
public List<UserDetail> userDetiaList(){
	
	return (List<UserDetail>) userDetialService.getAllUserDetial();
}




}
