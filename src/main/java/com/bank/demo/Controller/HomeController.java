package com.bank.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeController {

    @RequestMapping("/")
    public String home() {
        System.out.println("this is home page");
        return "index";
    }


    @RequestMapping("/UserRegistrationPage")
    public String UserRegistrationPage() {
        System.out.println("this is UserRegistrationPage");
        return "UserRegistrationPage";
    }

    @RequestMapping("/tractionList")
    public String tractionList() {
        System.out.println("tractionList");
        return "tranctionList";
    }
    @RequestMapping("/loginpage")
    public String loginpage() {
        System.out.println("this is loginpage");
        return "loginpage";
    }

    @RequestMapping("/Ledgerpage")
    public String Ledgerpage() {
        System.out.println("this is Ledgerpage");
        return "Ledgerpage";
    }
    @RequestMapping("/Transctiondetialpage")
    public String BankTransaction() {
        System.out.println("this is Transctiondetialpage");
        return "Transctiondetialpage";
    }

    @RequestMapping("/AccountRegistrationPage")
    public String AccountRegistrationPage() {
        System.out.println("this is AccountRegistrationPage");
        return "AccountRegistrationPage";
    }

    @RequestMapping("/accountDetials")
    public String accountDetials() {
        System.out.println("this is accountDetials");
        return "accountDetials";
    }
}
