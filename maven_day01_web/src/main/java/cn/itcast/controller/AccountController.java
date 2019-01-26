package cn.itcast.controller;

import cn.itcast.domain.Account;
import cn.itcast.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private IAccountService accountService;

    @RequestMapping("/findAccount")
    public String findAccount(Model model){
        List<Account> list = accountService.findAll();
        model.addAttribute("list",list);
        System.out.println(list);
        return "list";
    }
    @RequestMapping("/saveAccount")
    public String saveAccount(Account account){
        System.out.println("controller中的saveAccount方法执行了......");
        accountService.saveAccount(account);
        return "savesuccess";
    }
}
