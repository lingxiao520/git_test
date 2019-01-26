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

    @RequestMapping("/findAll")
    public String findAll(Model model){
        List<Account> accounts = accountService.findAll();
        model.addAttribute("list",accounts);
        return "list";
    }
    @RequestMapping("/saveAccount")
    public String saveAccount(Account account){
        accountService.saveAccount(account);
        return "list";
    }

}
