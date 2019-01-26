package cn.itcast.service.impl;

import cn.itcast.dao.IAccountDao;
import cn.itcast.domain.Account;
import cn.itcast.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("accountService")
public class AccountServiceImpl implements IAccountService {
    @Autowired
    private IAccountDao accountDao;

    @Override
    public List<Account> findAll() {
        System.out.println("service层findAll方法执行了");
        List<Account> accounts = accountDao.findAll();
        return accounts;
    }

    @Override
    public void saveAccount(Account account) {
        System.out.println("service层saveAccount方法执行了");
        accountDao.saveAccount(account);
    }
}
