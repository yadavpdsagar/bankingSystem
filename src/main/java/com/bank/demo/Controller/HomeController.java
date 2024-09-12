package com.bank.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeController {

    @RequestMapping("/user")
    public String home() {
        System.out.println("this is home page");
        return "index";
    }

    @RequestMapping("/admin")
    public String admin() {
        System.out.println("this is admin page");
        return "admin";
    }
    @RequestMapping("/employee")
    public String employee() {
        System.out.println("this is employee page");
        return "employee";
    }


    @RequestMapping("/admin/UserRegistrationPage")
    public String UserRegistrationPage() {
        System.out.println("this is UserRegistrationPage");
        return "UserRegistrationPage";
    }

    @RequestMapping("/adminemployee/tractionList")
    public String tractionList() {
        System.out.println("tractionList");
        return "tranctionList";
    }
//    @RequestMapping("/loginpage")
//    public String loginpage() {
//        System.out.println("this is loginpage");
//        return "loginpage";
//    }

    @RequestMapping("/admin/Ledgerpage")
    public String Ledgerpage() {
        System.out.println("this is Ledgerpage");
        return "Ledgerpage";
    }
    @RequestMapping("/employee/Transctiondetialpage")
    public String BankTransaction() {
        System.out.println("this is Transctiondetialpage");
        return "Transctiondetialpage";
    }

    @RequestMapping("/admin/AccountRegistrationPage")
    public String AccountRegistrationPage() {
        System.out.println("this is AccountRegistrationPage");
        return "AccountRegistrationPage";
    }

    @RequestMapping("/adminemployee/accountDetials")
    public String accountDetials() {
        System.out.println("this is accountDetials");
        return "accountDetials";
    }
}
